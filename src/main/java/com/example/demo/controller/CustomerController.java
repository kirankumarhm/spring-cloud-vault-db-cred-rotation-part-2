package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return userRepository.findAll();
    }

}
