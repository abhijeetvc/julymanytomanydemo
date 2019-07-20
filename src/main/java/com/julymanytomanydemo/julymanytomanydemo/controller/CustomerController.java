package com.julymanytomanydemo.julymanytomanydemo.controller;

import com.julymanytomanydemo.julymanytomanydemo.model.Customer;
import com.julymanytomanydemo.julymanytomanydemo.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping(value="/savecustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "Customer Saved";
    }
}
