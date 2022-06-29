package com.company.thisBankApp;

import java.util.Objects;

public class CreditCard {
    String no;
     int password=4458;
    double balance;
    static String cartType;
    //kredi kartının owneri var .
    Customer owner;
    BosBelesClass passwords;

    public CreditCard(String no, double balance) {
        this.no = no;
        this.balance = balance;

    }


    public CreditCard(String no, double balance, Customer owner) {
        this.no = no;
        this.balance = balance;
        this.owner = owner; //cc1.setOwner demek burası
		owner.setCc(this);
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Customer getOwner() {
        return owner;
    }


}
