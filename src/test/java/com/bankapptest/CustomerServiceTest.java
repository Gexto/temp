package com.bankapptest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.bankapp.models.CustomerModel;
import com.bankapp.models.AccountModel;
import com.bankapp.services.CustomerService;

public class CustomerServiceTest {

    CustomerService service = new CustomerService();

    @Test
    public void testGetAllCustomers() {

        List<CustomerModel> customers = service.getAllCustomers();

        assertNotNull(customers);
        assertTrue(customers.size() > 0);
    }

    @Test
    public void testGetCustomerById() {

        CustomerModel customer = service.getCustomerById(1);

        assertNotNull(customer);
        assertEquals("John", customer.getName());
    }

    @Test
    public void testGetCustomerByIdNotFound() {

        CustomerModel customer = service.getCustomerById(999);

        assertNull(customer);
    }

    @Test
    public void testGetAllAccounts() {

        List<AccountModel> accounts = service.getAllAccounts();

        assertTrue(accounts.size() > 0);
    }

    @Test
    public void testPremiumAccounts() {

        List<AccountModel> premium = service.getPremiumAccounts();

        for (AccountModel a : premium) {
            assertTrue(a.getBalance() > 10000);
        }
    }
}