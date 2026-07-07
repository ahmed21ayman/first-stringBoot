package com.dev.Quickstart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.dev.Quickstart.model.Book;
import com.dev.Quickstart.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Optional<Book> getBookById(Integer id){
        return bookRepository.findById(id);
    }
}
