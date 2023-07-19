package com.assignment.mappingPractice.repository;

import com.assignment.mappingPractice.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {

}
