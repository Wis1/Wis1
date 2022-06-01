package com.kodilla.kodillalibrary.service;


import com.kodilla.kodillalibrary.domain.Book;
import com.kodilla.kodillalibrary.domain.CopiesBook;
import com.kodilla.kodillalibrary.exceptions.BookNotFoundException;
import com.kodilla.kodillalibrary.repository.CopiesBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbCopiesBookService {

    private final CopiesBookRepository copiesBookRepository;
    private final DbBookService dbBookService;

    public Optional<CopiesBook> getCopiesBook(Long copieBookId) {
        return copiesBookRepository.findById(copieBookId);
    }

    public List<CopiesBook> getCopiesBookOfTitle(Long bookId) {
        return copiesBookRepository.findAllById(bookId);
    }

    public void save (CopiesBook copiesBook) { copiesBookRepository.save(copiesBook);}

    public CopiesBook addCopiesBook(Long bookId) throws BookNotFoundException {
        Book book= dbBookService.getBook(bookId).orElseThrow(BookNotFoundException::new);
        CopiesBook copiesBook= new CopiesBook(book, "avalaible");
        return copiesBook;
    }

    public void deleteCopiesBook(Long copiesBookId) { copiesBookRepository.deleteById(copiesBookId);
    }
}
