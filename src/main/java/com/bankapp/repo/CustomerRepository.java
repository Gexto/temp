package com.bankapp.repo;

import java.util.ArrayList;
import java.util.List;

import com.bankapp.models.AccountModel;
import com.bankapp.models.AccountType;
import com.bankapp.models.CustomerModel;

public class CustomerRepository {

    private List<CustomerModel> customers = new ArrayList<>();

    public CustomerRepository() {

        List<AccountModel> acc1 = new ArrayList<>();
        acc1.add(new AccountModel(1, AccountType.SAVINGS, 2000000));

        List<AccountModel> acc2 = new ArrayList<>();
        acc2.add(new AccountModel(2, AccountType.CHECKINGS, 60000));
        
        List<AccountModel> acc3 = new ArrayList<>();
        acc3.add(new AccountModel(3, AccountType.CHECKINGS, 100));

        customers.add(new CustomerModel(1, "Zues", acc1));
        customers.add(new CustomerModel(2, "Poseidon", acc2));
        customers.add(new CustomerModel(3, "Hades", acc3));

    }

    public List<CustomerModel> getAllCustomers() {
        return customers;
    }
}