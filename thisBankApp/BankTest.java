package com.company.thisBankApp;

import javax.swing.tree.DefaultTreeCellEditor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.StringTokenizer;

public class BankTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Ahmet");
		CreditCard cc1 = new CreditCard("1111111111111111", 1000.0);
		cc1.setOwner(c1); //kredi kartının sahibi c1 (ahmet)
		c1.setCc(cc1); //owner in kartı cc1

        Customer c2 = new Customer(2, "Kemal");
        CreditCard cc2 = new CreditCard("2222222222222222", 2500.0);

        BosBelesClass password = new BosBelesClass();
        password.passwords = 4459;
        c2.setCc(cc2);
        cc2.setOwner(c2);
        password.creditCard = cc2;
        cc2.passwords = password;

        //kredi kartına doğrudan customer i geçiyorum.
        if(cc2.password == password.passwords){
            System.out.println(cc2.getOwner().name);
        }
        else
            System.out.println("Şifre hatalı bilgileriniz gözükmez !");



        CreditCard cc3 = c2.getCc();
        if(cc3 == null)
            System.out.println("NULLLLLL");

        
    }

    }

