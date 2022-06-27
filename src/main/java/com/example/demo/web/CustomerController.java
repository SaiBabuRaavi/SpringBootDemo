package com.example.demo.web;

import com.example.demo.domain.Customer;
import com.example.demo.services.CustomerService;
import com.example.demo.services.MissedCallService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    String home(){
        return "Customer Home";
    }

    @GetMapping("/find/all")
    List<Customer> findAll(){
        return customerService.findAll();
    }
}
