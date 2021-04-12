package com.springtransaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtransaction.entity.Book;
import com.springtransaction.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/savebook",method = RequestMethod.POST)
    @ResponseBody
    public Book saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return book;
    }

    @RequestMapping(value = "/deletebook/{id}",method = RequestMethod.GET)
    @ResponseBody
    public void deleteBook(@PathVariable Integer id) {
        bookService.deleteBook(id);
    }
}