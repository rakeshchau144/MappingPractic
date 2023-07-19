package com.assignment.mappingPractice.repository;

import com.assignment.mappingPractice.model.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends CrudRepository<Laptop,Long> {

}
