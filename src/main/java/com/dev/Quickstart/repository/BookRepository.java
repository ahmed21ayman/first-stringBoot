package com.dev.Quickstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.Quickstart.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
