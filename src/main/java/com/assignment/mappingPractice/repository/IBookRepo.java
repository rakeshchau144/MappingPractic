package com.assignment.mappingPractice.repository;

import com.assignment.mappingPractice.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends CrudRepository<Book,Long> {
}
