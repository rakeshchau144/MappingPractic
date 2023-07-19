package com.assignment.mappingPractice.controller;

import com.assignment.mappingPractice.model.Course;
import com.assignment.mappingPractice.model.Laptop;
import com.assignment.mappingPractice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;


    @GetMapping("laptop")
    public Iterable<Laptop> getLaptop(){
        return laptopService.getLaptop();
    }

    @PostMapping("laptop/add")
    public String postLaptop(@RequestBody Laptop laptop){
        return laptopService.postLaptop(laptop);
    }

    @DeleteMapping("laptop/delete")
    public String removeLaptop(@RequestBody Long id){
        return laptopService.removeLaptop(id);
    }
    @PutMapping("laptop/put")
    public String updateLaptop(@PathVariable Long id){
        return laptopService.updateLaptop(id);
    }

}
