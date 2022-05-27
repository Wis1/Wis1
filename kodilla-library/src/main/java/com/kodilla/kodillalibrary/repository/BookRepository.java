package com.kodilla.kodillalibrary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kodilla.kodillalibrary.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAll();
}
