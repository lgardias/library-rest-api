package com.lgardias.rest.services;

import com.lgardias.rest.models.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();
    Book createBook(Book book);
}
