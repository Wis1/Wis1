package com.kodilla.kodillalibrary.controller;

import com.kodilla.kodillalibrary.domain.Reader;
import com.kodilla.kodillalibrary.domain.dto.ReaderDto;
import com.kodilla.kodillalibrary.mapper.ReaderMapper;
import com.kodilla.kodillalibrary.service.DbReadersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addReader(@RequestBody ReaderDto readerDto){
        Reader reader= readerMapper.mapToReader(readerDto);
        dbReadersService.saveReader(reader);
    }

    @DeleteMapping(value = "{userId}")
    public void deleteReader(@PathVariable Integer userId){
        dbReadersService.deleteReader(userId);

    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void editReader(@RequestBody ReaderDto readerDto){
        Reader reader= readerMapper.mapToReader(readerDto);
        dbReadersService.saveReader(reader);
    }

}
