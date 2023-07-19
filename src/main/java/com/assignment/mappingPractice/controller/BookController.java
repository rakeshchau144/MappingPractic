package com.assignment.mappingPractice.controller;

import com.assignment.mappingPractice.model.Address;
import com.assignment.mappingPractice.model.Book;
import com.assignment.mappingPractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("books")
    public Iterable<Book> getBook(){
        return bookService.getBook();
    }

    @PostMapping("book/add")
    public String postBook(@RequestBody Book book){
        return bookService.postBook(book);
    }

    @DeleteMapping("book/delete")
    public String removeBook(@RequestBody Long id){
        return bookService.removeBook(id);
    }
    @PutMapping("book/put")
    public String updateBook(@PathVariable Long id){
        return bookService.updateBook(id);
    }


}
