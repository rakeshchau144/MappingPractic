package com.assignment.mappingPractice.service;

import com.assignment.mappingPractice.model.Course;
import com.assignment.mappingPractice.model.Laptop;
import com.assignment.mappingPractice.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo iLaptopRepo;

    public Iterable<Laptop> getLaptop() {
        return iLaptopRepo.findAll();
    }

    public String postLaptop(Laptop laptop) {
        iLaptopRepo.save(laptop);
        return "Added";
    }

    public String removeLaptop(Long id) {
        Optional<Laptop> laptopId= iLaptopRepo.findById(id);
        if(laptopId.isPresent()){
            iLaptopRepo.deleteById(id);
            return "Remove successfully";
        }
        return "Id not matched";
    }

    public String updateLaptop(Long id) {
        return  "Not complete";
    }
}
