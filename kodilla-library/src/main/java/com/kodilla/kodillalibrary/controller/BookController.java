package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.domain.dto.BookDto;
import com.kodilla.kodillalibrary.mapper.BookMapper;
import com.kodilla.kodillalibrary.service.DbBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.kodilla.kodillalibrary.domain.Book;
import java.util.List;

@RestController
@RequestMapping("/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final DbBookService bookService;
    private final BookMapper bookMapper;

    @GetMapping
    public List<BookDto> getBooks(){
        List<Book> books= bookService.getAllBooks();
        return bookMapper.mapToBookDtoList(books);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody BookDto bookDto){
        Book book= bookMapper.mapToBook(bookDto);
        bookService.saveBook(book);
    }

    @DeleteMapping(value = "{bookId}")
    public void deleteBook(@PathVariable Long bookId){
        bookService.deleteBook(bookId);

    }
}
