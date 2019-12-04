package com.terry.proj1;

import javax.swing.*;
import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;


    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean addCustomer(Customer customer, Double initTransAmt)
    {
        for(int i=0;i<this.customers.size();i++)
        {
            if(this.customers.get(i).getCustomerName().equals(customer));
            System.out.println("Customer already part of this branch.");
            return false;

        }
        customers.add(customer);
        customer.addTransaction(initTransAmt);
        return true;
    }

    public boolean addTrans(Customer customer, Double transAmt)
    {
        for(int i=0;i<this.customers.size();i++)
        {
            if(this.customers.get(i).getCustomerName().equals(customer.getCustomerName()))
            {
                System.out.println("Customer verified as part of this branch.");
                customer.addTransaction(transAmt);
                return true;
            }
            else
            {
                System.out.println("Cannot process transaction as Customer not part of this branch.");
                return false;
            }

        }
        return false;
    }

    public void printListCustomers() {

        for (int i = 0; i < this.customers.size(); i++) {
            String customerName= customers.get(i).getCustomerName();
            System.out.println("List of Customers");
            System.out.println("customerName -> "+ customerName);
        }
    }
}
