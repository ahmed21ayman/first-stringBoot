package com.dev.Quickstart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.Quickstart.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/all")
    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("Alf lela w lela", "Aymoon", 200));
        books.add(new Book("mia lila w lila", "AYMAAN", 150));
        books.add(new Book("3shra lela w lela", "Ayman", 100));
        return books;
    }
    @GetMapping("/one")
    public Book getOneBook(){
        Book oneBook = new Book("ahmed", "lela w lela", 50);
        return oneBook;
    }
    @PostMapping("")
    public Book createBook(@RequestBody Book book){
        return book;
    }
}
