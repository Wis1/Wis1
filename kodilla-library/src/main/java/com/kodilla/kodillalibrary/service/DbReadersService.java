package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.domain.Reader;
import com.kodilla.kodillalibrary.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbReadersService {

    private final ReaderRepository readerRepository;

    public List<Reader> getAllReaders(){
        return readerRepository.findAll();
    }

    public void saveReader(Reader reader){
        readerRepository.save(reader);
    }
}
