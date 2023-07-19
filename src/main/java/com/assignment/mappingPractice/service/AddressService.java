package com.assignment.mappingPractice.service;

import com.assignment.mappingPractice.model.Address;
import com.assignment.mappingPractice.model.Course;
import com.assignment.mappingPractice.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String postAddress(Address address) {
        iAddressRepo.save(address);
        return "Added complete";
    }

    public Iterable<Address> getAddress() {
        return iAddressRepo.findAll();

    }

    public String removeAddress(Long id) {
        Optional<Address> addressId= iAddressRepo.findById(id);
        if(addressId.isPresent()){
            iAddressRepo.deleteById(id);
            return "Remove successfully";
        }
        return "Id not matched";
    }

    public String updateAddress(Address address) {
        return "Not complete";
    }
}
