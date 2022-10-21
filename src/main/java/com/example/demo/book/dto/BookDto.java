package com.example.demo.book.dto;

import com.example.demo.book.entity.Book;

public class BookDto {
    public String title;
    public String author;
    public int year;

    public BookDto() {
    }

    public BookDto(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.year = book.year;
    }
}
