package com.terry.proj1;
// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Barclays");
        Branch branch = new Branch("Barkingside");
        Customer customer1 = new Customer("Terry");
        Customer customer2 = new Customer("Selvin");



        bank.addBranch(branch);
        bank.addCustomer(branch,customer1,1000.00);
        bank.addCustomer(branch,customer2,1000.00);

        bank.addTrans(branch,customer1,2000.00);
        bank.addTrans(branch,customer2,2000.00);

        bank.printListCustomers(branch);
    }
}
