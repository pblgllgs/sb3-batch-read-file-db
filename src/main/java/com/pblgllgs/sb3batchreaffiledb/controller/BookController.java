package com.pblgllgs.sb3batchreaffiledb.controller;
/*
 *
 * @author pblgl
 * Created on 21-04-2024
 *
 */

import com.pblgllgs.sb3batchreaffiledb.entity.BookEntity;
import com.pblgllgs.sb3batchreaffiledb.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping
    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }
}
