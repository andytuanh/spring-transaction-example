package com.springtransaction.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "book", schema = "newuser")
@NamedStoredProcedureQuery(name = "Book.deleteBookById",
        procedureName = "REMOVE_BOOK", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_bookid", type = Integer.class)})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    @Column(name="book_name")
    private String bookName;

    @Column(name="auther_name")
    private String autherName;

    @Column(name="price")
    private int price;

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}