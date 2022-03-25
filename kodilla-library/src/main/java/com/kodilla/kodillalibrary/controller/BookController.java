package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.domain.dto.BookDto;
import com.kodilla.kodillalibrary.mapper.BookMapper;
import com.kodilla.kodillalibrary.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.kodilla.kodillalibrary.domain.Book;
import java.util.List;

//@CrossOrigin("*")
@RestController
@RequestMapping("/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final DbService service;
    private final BookMapper bookMapper;

    @GetMapping
    public List<BookDto> getBooks(){
        List<Book> books= service.getAllBooks();
        return bookMapper.mapToBookDtoList(books);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody BookDto bookDto){
        Book book= bookMapper.mapToBook(bookDto);
        service.saveBook(book);
    }
}
