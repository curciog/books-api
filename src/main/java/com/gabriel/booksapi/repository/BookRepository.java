package com.gabriel.booksapi.repository;

import com.gabriel.booksapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
