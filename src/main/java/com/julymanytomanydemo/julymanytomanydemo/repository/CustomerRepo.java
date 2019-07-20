package com.julymanytomanydemo.julymanytomanydemo.repository;

import com.julymanytomanydemo.julymanytomanydemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
