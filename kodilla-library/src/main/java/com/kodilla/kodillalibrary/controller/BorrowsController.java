package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.mapper.BorrowsMapper;
import com.kodilla.kodillalibrary.service.DbBorrowsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/v1/borrow")
@RequiredArgsConstructor

public class BorrowsController {

    private final DbBorrowsService dbBorrowsService;
    private final BorrowsMapper borrowsMapper;

    @GetMapping
    public void getBorrows(@RequestParam Long userId){

    }

    @PostMapping
    public void addBorrow(@RequestParam Long userId, @RequestParam Long bookId){

    }

    @PutMapping(value = "{borrowId}/return")
    public void returnBook(@PathVariable Long borrowId){

    }

    @PutMapping(value = "{borrowId}/extend/{days}")
    public void extendBook(@PathVariable Long borrowId, @PathVariable Integer days){

    }

}
