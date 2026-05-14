package com.bankapp.services;
import java.util.ArrayList;
import java.util.List;

import com.bankapp.models.AccountModel;
import com.bankapp.models.CustomerModel;
import com.bankapp.repo.CustomerRepository;

public class CustomerService {

    private CustomerRepository repo;

    public CustomerService() {
        repo = new CustomerRepository();
    }

    public List<CustomerModel> getAllCustomers() {
        return repo.getAllCustomers();
    }

    public CustomerModel getCustomerById(int id) {

        for (CustomerModel c : repo.getAllCustomers()) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public List<AccountModel> getAllAccounts() {

        List<AccountModel> accounts = new ArrayList<>();

        for (CustomerModel c : repo.getAllCustomers()) {
            accounts.addAll(c.getAccounts());
        }

        return accounts;
    }

    public List<AccountModel> getAccountsByCustomerId(int customerId) {

        CustomerModel customer = getCustomerById(customerId);

        if (customer != null) {
            return customer.getAccounts();
        }

        return new ArrayList<>();
    }

    public List<AccountModel> getPremiumAccounts() {

        List<AccountModel> premiumAccounts = new ArrayList<>();

        for (AccountModel a : getAllAccounts()) {

            if (a.getBalance() > 10000) {
                premiumAccounts.add(a);
            }
        }

        return premiumAccounts;
    }
}