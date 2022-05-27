package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.domain.Borrow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface BorrowRepository extends CrudRepository<Borrow,Long> {

    List<Borrow> findAllById(Integer readerId);
    Optional<Borrow> findById(Long borrowId);

}
