package com.assignment.librarymanagementsystem.Library.management.system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    private String  bookid;
    private String bookname;
    private String bookauthor;
    private float bookprice;
    private String bookcategory;

}
