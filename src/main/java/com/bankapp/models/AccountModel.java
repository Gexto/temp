package com.bankapp.models;

public class AccountModel {

    private int id;
    private AccountType type;
    private double balance;

    public AccountModel() {
    }

    public AccountModel(int id, AccountType type, double balance) {
        this.id = id;
        this.type = type;
        this.balance = balance;
    }

    //getters
    public int getId() {
        return id;
    }

    public AccountType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }
    
    //setters
    public void setId(int id) {
    	this.id = id;
    }

    public void setType(AccountType type) {
    	this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}