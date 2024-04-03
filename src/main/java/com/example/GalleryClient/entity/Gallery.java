package com.example.GalleryClient.entity;

import java.util.List;

public class Gallery {
    private Integer id;
    private List<Object> books;

    public Gallery(Integer id, List<Object> books) {
        this.id = id;
        this.books = books;
    }

    public Gallery() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Object> getBooks() {
        return books;
    }

    public void setBooks(List<Object> books) {
        this.books = books;
    }
}
