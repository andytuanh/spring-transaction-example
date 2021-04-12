package com.springtransaction.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springtransaction.entity.Book;

@Component
public interface BookService {
    public void saveBook(Book book);

    public void deleteBook(Integer id);

}