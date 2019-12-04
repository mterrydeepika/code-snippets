package com.terry.proj1;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public boolean addBranch(Branch branch) {
        this.branches.add(branch);
        return true;
    }

    public boolean addCustomer(Branch branch, Customer customer, Double initTransAmt) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getBranchName().equals(branch.getBranchName())) {
                branch.addCustomer(customer, initTransAmt);

            }
        }
    return true;
    }

        public boolean addTrans(Branch branch, Customer customer, Double transAmt)
        {
            for (int i = 0; i < this.branches.size(); i++) {
                if (this.branches.get(i).getBranchName().equals(branch.getBranchName())) {
                    branch.addTrans(customer, transAmt);

                }
            }
            return true;
        }

    public void printListCustomers (Branch branch)  {
            for (int i = 0; i < this.branches.size(); i++) {
                String brchName = branches.get(i).getBranchName();
                if (branch.getBranchName().equals(brchName)) {
                    branch.printListCustomers();
                }
            }
        }

    }
