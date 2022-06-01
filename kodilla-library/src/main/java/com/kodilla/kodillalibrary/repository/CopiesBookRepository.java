package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.domain.CopiesBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CopiesBookRepository extends CrudRepository<CopiesBook, Long> {

    List<CopiesBook> findAllById(Long bookId);

}
