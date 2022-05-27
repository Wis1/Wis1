package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.domain.Borrow;
import com.kodilla.kodillalibrary.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface BorrowsRepository extends CrudRepository<Borrow,Long> {

    List<Borrow> findAllById(Reader reader);

}
