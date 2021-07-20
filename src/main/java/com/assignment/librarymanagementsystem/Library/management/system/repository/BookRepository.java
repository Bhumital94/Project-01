package com.assignment.librarymanagementsystem.Library.management.system.repository;

import com.assignment.librarymanagementsystem.Library.management.system.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends JpaRepository<Book, String> {
}
