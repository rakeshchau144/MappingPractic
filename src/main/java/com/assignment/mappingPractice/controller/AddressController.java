package com.assignment.mappingPractice.controller;

import com.assignment.mappingPractice.model.Address;
import com.assignment.mappingPractice.repository.IAddressRepo;
import com.assignment.mappingPractice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("address")
    public Iterable<Address> getAddress(){
        return addressService.getAddress();
    }

    @PostMapping("address/add")
    public String  postAddress(@RequestBody Address address){
        return addressService.postAddress(address);
    }

    @DeleteMapping("address/delete")
    public String  removeAddress(@RequestBody Long id){
        return addressService.removeAddress(id);
    }

    @PutMapping("address/put")
    public String  updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }
}
