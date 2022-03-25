package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.domain.Borrows;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowsRepository extends CrudRepository<Borrows,Long> {

}
