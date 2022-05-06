package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.repository.BorrowsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DbBorrowsService {
    private final BorrowsRepository borrowsRepository;
}
