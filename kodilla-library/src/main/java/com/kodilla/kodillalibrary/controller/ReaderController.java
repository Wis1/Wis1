package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.domain.Reader;
import com.kodilla.kodillalibrary.domain.dto.ReaderDto;
import com.kodilla.kodillalibrary.mapper.ReaderMapper;
import com.kodilla.kodillalibrary.service.DbReadersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/reader")
@RequiredArgsConstructor

public class ReaderController {

    private final DbReadersService dbReadersService;
    private final ReaderMapper readerMapper;

    @GetMapping()
    public List<ReaderDto> getReaders(){
        List<Reader> readers= dbReadersService.getAllReaders();
        return readerMapper.mapToReaderDtoList(readers);

    }

    @PostMapping
    public void addReader(@RequestBody ReaderDto readerDto){

    }

    @DeleteMapping
    public void deleteReader(@PathVariable Long userId){

    }

    @PutMapping
    public void editReader(@RequestBody ReaderDto readerDto){

    }

}
