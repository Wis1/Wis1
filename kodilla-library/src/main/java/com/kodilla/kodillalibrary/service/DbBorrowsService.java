package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.domain.Borrow;
import com.kodilla.kodillalibrary.domain.CopiesBook;
import com.kodilla.kodillalibrary.domain.Reader;
import com.kodilla.kodillalibrary.exceptions.BorrowNotFoundException;
import com.kodilla.kodillalibrary.exceptions.CopiesBookNotFoundException;
import com.kodilla.kodillalibrary.exceptions.ReaderNotFoundException;
import com.kodilla.kodillalibrary.repository.BorrowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbBorrowsService {
    private final BorrowRepository borrowRepository;
    private final DbCopiesBookService dbCopiesBookService;
    private final DbReadersService dbReadersService;

    public List<Borrow> getAllBorrowsForReader(Integer readerId){
        return borrowRepository.findAllById(readerId);
    }

    public Optional<Borrow> getBorrow(Long borrowId) { return borrowRepository.findById(borrowId);}

    public Borrow addBorrow(Long copieBookId,Integer readerId) throws CopiesBookNotFoundException, ReaderNotFoundException{
        CopiesBook copiesBook= dbCopiesBookService.getCopiesBook(copieBookId).orElseThrow(CopiesBookNotFoundException::new);
        copiesBook.setStatus("borrowed");
        Reader reader= dbReadersService.getReader(readerId).orElseThrow(ReaderNotFoundException::new);
        Borrow borrow= new Borrow(copiesBook,reader, LocalDate.now(),LocalDate.now().plusDays(30));
        return borrow;
    }

    public CopiesBook returnCopiesBook(Long borrowId) throws BorrowNotFoundException{
        Borrow borrow= borrowRepository.findById(borrowId).orElseThrow(BorrowNotFoundException::new);
        CopiesBook copiesBook=borrow.getCopieBook();
        copiesBook.setStatus("avalaible");
        return copiesBook;
    }

    public void saveBorrow(Borrow borrow){ borrowRepository.save(borrow);}

    public Borrow extendBorrow(Long borrowId, Integer days)throws BorrowNotFoundException{
        Borrow borrow= borrowRepository.findById(borrowId).orElseThrow(BorrowNotFoundException::new);
        LocalDate dateOfThePlannedReturn= borrow.getDateOfReturn();
        borrow.setDateOfReturn(dateOfThePlannedReturn.plusDays(days));
        return borrow;
    }
}
