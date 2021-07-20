package com.assignment.librarymanagementsystem.Library.management.system.service;

import com.assignment.librarymanagementsystem.Library.management.system.model.Book;
import com.assignment.librarymanagementsystem.Library.management.system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    private Book book;

    // fetch all books

    public List<Book> getAllBooks(){
        return this.bookRepository.findAll();
    }

    // add new book

    public String addNewBook(Book book){
        this.bookRepository.save(book);
        return "Added Book successfully";
    }


    // update book details


    // delete book from list

    public String deleteBook(String books){
        this.bookRepository.save(book);
        return "Deleted Book Successfully";
    }
}
