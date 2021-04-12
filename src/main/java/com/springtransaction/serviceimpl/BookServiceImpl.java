package com.springtransaction.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springtransaction.entity.Book;
import com.springtransaction.repository.BookRepository;
import com.springtransaction.service.BookService;
import org.springframework.transaction.interceptor.TransactionAspectSupport;


@Service
@Transactional(rollbackFor = {ArrayIndexOutOfBoundsException.class, NullPointerException.class})
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public void saveBook(Book book) {
        Book book1 = null;
        book1 = bookRepository.save(book);
        String s1 = null;
        try {
            int length = s1.length();
        } catch(NullPointerException ex) {
            System.out.println("NullPointerException -> should be rolling back");
            // uncomment the statement below to for rollback
            // TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }

    public void deleteBook(Integer book_id) {
        bookRepository.deleteBook(book_id);
        int arr[] = {1, 2, 3};
        try {
            int value = arr[3];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException -> should be rolling back");
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }

    }
}