package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.domain.Borrow;
import com.kodilla.kodillalibrary.domain.CopiesBook;
import com.kodilla.kodillalibrary.domain.Reader;
import com.kodilla.kodillalibrary.exceptions.BorrowNotFoundException;
import com.kodilla.kodillalibrary.exceptions.CopiesBookNotFoundException;
import com.kodilla.kodillalibrary.exceptions.ReaderNotFoundException;
import com.kodilla.kodillalibrary.mapper.BorrowsMapper;
import com.kodilla.kodillalibrary.service.DbBookService;
import com.kodilla.kodillalibrary.service.DbBorrowsService;
import com.kodilla.kodillalibrary.service.DbCopiesBookService;
import com.kodilla.kodillalibrary.service.DbReadersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/borrow")
@RequiredArgsConstructor

public class BorrowsController {

    private final DbBorrowsService dbBorrowsService;
    private final BorrowsMapper borrowsMapper;
    private final DbReadersService dbReadersService;
    private final DbBookService dbBookService;
    private final DbCopiesBookService dbCopiesBookService;

    @GetMapping(value = "{readerId}")
    public List<Borrow> getBorrows(@PathVariable Integer readerId)throws BorrowNotFoundException{
        Reader reader= dbReadersService.getReader(readerId).orElseThrow(BorrowNotFoundException::new);
        return dbBorrowsService.getAllBorrowsForReader(reader.getId());
    }

    @PostMapping("/addNewBorrow")
    @ResponseBody
    public void addBorrow(@RequestParam Integer readerId, @RequestParam Long copieBookId) throws ReaderNotFoundException, CopiesBookNotFoundException {
        Borrow borrow= dbBorrowsService.addBorrow(copieBookId, readerId);
        dbBorrowsService.saveBorrow(borrow);
    }

    @PutMapping(value = "{borrowId}/return")
    public void returnBook(@PathVariable Long borrowId) throws BorrowNotFoundException {
        CopiesBook copiesBook= dbBorrowsService.returnCopiesBook(borrowId);
        dbCopiesBookService.save(copiesBook);
    }

    @PutMapping(value = "{borrowId}/extend/{days}")
    public void extendBook(@PathVariable Long borrowId, @PathVariable Integer days)throws BorrowNotFoundException{
        Borrow borrow= dbBorrowsService.extendBorrow(borrowId, days);
        dbBorrowsService.saveBorrow(borrow);
    }

}
