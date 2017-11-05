package com.lgardias.rest.controllers;

import com.lgardias.rest.models.Book;
import com.lgardias.rest.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookServiceImpl bookSerwice;

    @Autowired
    public BookController(BookServiceImpl bookSerwice){
        this.bookSerwice = bookSerwice;
    }

    @RequestMapping(value = "/library", method = RequestMethod.GET)
    public List<Book> getBooks(){
        return bookSerwice.getBooks();
    }

    @RequestMapping(value = "/library", method = RequestMethod.POST)
    public Book createBook(@RequestBody Book book){
        return bookSerwice.createBook(book);
    }

}
