package com.assignment.librarymanagementsystem.Library.management.system.controller;

import com.assignment.librarymanagementsystem.Library.management.system.model.Book;
import com.assignment.librarymanagementsystem.Library.management.system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    private Object Book;

    @GetMapping(value = "/all")
    public List<Book> getAllItems(){
        return this.bookService.getAllBooks();
    }

    @PostMapping(value = "/add")
    public String addBook(@RequestBody Book book){
        return this.bookService.addNewBook(book);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable String  id){
        String s = this.bookService.deleteBook(id);
        return s;
    }
}
