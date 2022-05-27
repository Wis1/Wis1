package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.domain.Reader;
import com.kodilla.kodillalibrary.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbReadersService {

    private final ReaderRepository readerRepository;

    public Optional<Reader> getReader(Integer id) { return readerRepository.findById(id);}

    public List<Reader> getAllReaders(){
        return readerRepository.findAll();
    }

    public void saveReader(Reader reader){
        readerRepository.save(reader);
    }

    public void deleteReader(Integer id) {readerRepository.deleteById(id);}
}
