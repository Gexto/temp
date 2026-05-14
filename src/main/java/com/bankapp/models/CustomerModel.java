package com.bankapp.models;
import java.util.List;

public class CustomerModel {

    private int id;
    private String name;
    private List<AccountModel> accounts;

    public CustomerModel() {
    }

    public CustomerModel(int id, String name, List<AccountModel> accounts) {
        this.id = id;
        this.name = name;
        this.accounts = accounts;
    }

    
    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<AccountModel> getAccounts() {
        return accounts;
    }
    
    //setters
    public void setId(int id) {
    	this.id = id;
    }
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setAccounts(List<AccountModel> accounts) {
        this.accounts = accounts;
    }
}