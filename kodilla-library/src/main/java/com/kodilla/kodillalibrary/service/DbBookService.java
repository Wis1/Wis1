package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.exceptions.BookNotFoundException;
import com.kodilla.kodillalibrary.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.kodilla.kodillalibrary.domain.Book;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbBookService {

    private final BookRepository repository;

    public Optional<Book> getBook(Long bookId){ return repository.findById(bookId);}

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public void saveBook(Book book){repository.save(book);}

    public void deleteBook(Long bookId){ repository.deleteById(bookId);
    }
}
