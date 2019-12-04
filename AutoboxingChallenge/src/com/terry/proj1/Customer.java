package com.terry.proj1;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.transactions= new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public boolean addTransaction(Double transAmt)
    {
        transactions.add(transAmt);
        System.out.println("Added transaction successfully");
        return true;
    }

}
