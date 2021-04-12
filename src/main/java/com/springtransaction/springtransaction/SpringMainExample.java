package com.springtransaction.springtransaction;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.springtransaction.entity.Book;
import com.springtransaction.service.BookService;

@SpringBootApplication(scanBasePackages={"com.springtransaction"})
@EntityScan("com.springtransaction.*")
public class SpringMainExample {

    public static void main(final String[] args) {
        final ConfigurableApplicationContext configurableApplicationContext = SpringApplication
                .run(SpringMainExample.class, args);
    }
}
