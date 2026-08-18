package com.gabriel.booksapi.controller;

import com.gabriel.booksapi.entity.Book;
import com.gabriel.booksapi.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BooksController {

    private final BookService bookService;

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
