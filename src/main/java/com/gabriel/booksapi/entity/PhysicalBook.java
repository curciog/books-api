package com.gabriel.booksapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "physical_books")
public class PhysicalBook extends Book {

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private Double weight;

    @Column(nullable = false)
    private Double height;

    @Column(nullable = false)
    private Double depth;
}
