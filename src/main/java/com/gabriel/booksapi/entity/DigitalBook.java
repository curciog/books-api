package com.gabriel.booksapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "digital_books")
public class DigitalBook extends Book {

    @Column(nullable = false)
    private String fileFormat;

    @Column(nullable = false)
    private Double fileSize;

    @Column(nullable = false, unique = true)
    private String downloadUrl;
}
