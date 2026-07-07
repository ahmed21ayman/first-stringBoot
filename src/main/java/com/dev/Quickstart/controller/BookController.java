package com.dev.Quickstart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.Quickstart.model.Book;
import com.dev.Quickstart.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Optional<Book> getOneBook(@PathVariable int id){
        return bookService.getBookById(id);
    }
    @PostMapping("")
    public Book createBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }
}
