package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.domain.Book;
import com.kodilla.kodillalibrary.domain.Borrow;
import com.kodilla.kodillalibrary.domain.CopiesBook;
import com.kodilla.kodillalibrary.exceptions.BookNotFoundException;
import com.kodilla.kodillalibrary.exceptions.CopiesBookNotFoundException;
import com.kodilla.kodillalibrary.exceptions.ReaderNotFoundException;
import com.kodilla.kodillalibrary.repository.CopiesBookRepository;
import com.kodilla.kodillalibrary.service.DbBookService;
import com.kodilla.kodillalibrary.service.DbCopiesBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("v1/copiesBook")
@RequiredArgsConstructor
public class CopiesBookController {

    private final DbCopiesBookService dbCopiesBookService;
    private final CopiesBookRepository copiesBookRepository;
    private final DbBookService dbBookService;

    @GetMapping(value="{bookId}")
    public List<CopiesBook> getCopiesBookOfTitle(@PathVariable Long bookId) throws BookNotFoundException {
        Book book= dbBookService.getBook(bookId).orElseThrow(BookNotFoundException::new);
        return dbCopiesBookService.getCopiesBookOfTitle(book.getId());
    }
    @GetMapping(value = "{bookId}/available")
    public List<CopiesBook> getAvailableCopiesBookOfTitle(@PathVariable Long bookId) throws BookNotFoundException{

        Book book= dbBookService.getBook(bookId).orElseThrow(BookNotFoundException::new);
        return dbCopiesBookService.getCopiesBookOfTitle(book.getId()).stream()
                .filter(cb->cb.getStatus().equals("available"))
                .collect(Collectors.toList());

    }

    @PostMapping("/addNewCopiesBook")
    @ResponseBody
    public void addCopiesBook(@RequestParam Long bookId) throws BookNotFoundException {
        Book book= dbBookService.getBook(bookId).orElseThrow(BookNotFoundException::new);
        CopiesBook copiesBook= dbCopiesBookService.addCopiesBook(book.getId());
        dbCopiesBookService.save(copiesBook);
    }

    @DeleteMapping(value = "{copiesBookId}")
    public void deleteCopiesOfBook(@PathVariable Long copiesBookId) throws CopiesBookNotFoundException{
        dbCopiesBookService.deleteCopiesBook(copiesBookId);
    }




}
