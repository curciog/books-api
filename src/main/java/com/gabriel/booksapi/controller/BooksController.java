package com.gabriel.booksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BooksController {

    @GetMapping
    public String getBooks() {
        return "Books API is working.";
    }

    /*@GetMapping("/{id}")
    public String getBooksById(long id) {

    }*/
}
