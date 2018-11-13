package com.andymitchell.springcachedemo;

public interface BookRepository {

    Book getByIsbn(String isbn);
}
