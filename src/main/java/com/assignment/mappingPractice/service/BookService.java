package com.assignment.mappingPractice.service;

import com.assignment.mappingPractice.model.Address;
import com.assignment.mappingPractice.model.Book;
import com.assignment.mappingPractice.repository.IAddressRepo;
import com.assignment.mappingPractice.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    IBookRepo iBookRepo;

    public String updateBook(Long id) {
       /* Optional<Book> bookId =iBookRepo.findById(id);
        Book book=null;
        if(bookId.isEmpty()){
            return "Id not exist";
        }
        book=bookId.get();
        book.setAuthor();
        book.setDescription();
        book.setTitle();
        book.setPrice();
        return "Updated "; */
        return "Not complete";


    }

    public String removeBook(Long id) {
        Optional<Book> bookid= iBookRepo.findById(id);
        if(bookid.isPresent()){
            iBookRepo.deleteById(id);
            return "Remove successfully";
        }
        return "Id not matched";
    }

    public String postBook(Book book) {
        iBookRepo.save(book);
        return "Add successfull";
    }

    public Iterable<Book> getBook() {
        return iBookRepo.findAll();
    }
}
