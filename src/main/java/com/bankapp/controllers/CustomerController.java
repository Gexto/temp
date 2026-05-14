package com.bankapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.bankapp.models.CustomerModel;
import com.bankapp.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService service = new CustomerService();

    @GetMapping
    public List<CustomerModel> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerModel getCustomerById(@PathVariable int id) {
        return service.getCustomerById(id);
    }
}