package com.springtransaction.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springtransaction.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Procedure(name = "Book.deleteBookById")
    void deleteBook(@Param("p_bookid") Integer book_id);
}