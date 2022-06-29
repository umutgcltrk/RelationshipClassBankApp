package com.company.thisBankApp;

public class Customer {
    int id;
    String name;
    //Customer in kredi kartı var.
    CreditCard cc;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setCc(CreditCard cc) {
        this.cc = cc;
    }

    public CreditCard getCc() {
        return cc;
    }
}
