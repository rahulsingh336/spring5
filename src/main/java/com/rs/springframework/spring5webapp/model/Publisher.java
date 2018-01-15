package com.rs.springframework.spring5webapp.model;

import javax.persistence.*;

/**
 * Created by rs on 1/15/2018.
 */
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name, address;

    //private Book book;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
        //this.book = book;
    }

    /*public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
