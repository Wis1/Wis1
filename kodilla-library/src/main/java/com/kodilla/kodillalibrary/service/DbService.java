package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.kodilla.kodillalibrary.domain.Book;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DbService {

    private final BookRepository repository;

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public void saveBook(Book book){repository.save(book);}

}
