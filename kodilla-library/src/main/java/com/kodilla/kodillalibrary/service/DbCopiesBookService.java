package com.kodilla.kodillalibrary.service;


import com.kodilla.kodillalibrary.domain.CopiesBook;
import com.kodilla.kodillalibrary.repository.CopiesBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbCopiesBookService {

    private final CopiesBookRepository copiesBookRepository;

    public Optional<CopiesBook> getCopiesBook(Long copieBookId) {
        return copiesBookRepository.findById(copieBookId);
    }

    public void save (CopiesBook copiesBook) { copiesBookRepository.save(copiesBook);}
}
