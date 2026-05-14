package com.bankapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.bankapp.models.AccountModel;
import com.bankapp.services.CustomerService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private CustomerService service = new CustomerService();

    @GetMapping
    public List<AccountModel> getAllAccounts() {
        return service.getAllAccounts();
    }

    @GetMapping("/premium")
    public List<AccountModel> getPremiumAccounts() {
        return service.getPremiumAccounts();
    }

    // accounts for a specific customer
    @GetMapping("/customer/{customerId}")
    public List<AccountModel> getAccountsByCustomerId(@PathVariable int customerId) {
        return service.getAccountsByCustomerId(customerId);
    }
}