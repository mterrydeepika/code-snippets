package com.terry.proj1;

import javax.swing.*;
import java.util.Scanner;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilephone = new MobilePhone("07566768161");

    public static void main(String[] args) {
        int action = 0;
        boolean quit = false;
        startPhone();
        printOptions();
        while (!quit) {
            System.out.println("Enter your action. (Press 6 to see available actions)");
            action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    printListOfContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }

    private static void printOptions() {
        System.out.println("Available actions:\n Press");
        System.out.println("0 - Shutdown\n" +
                           "1 - Print list of contacts\n" +
                           "2 - Add new contact\n" +
                           "3 - Update existing contact\n" +
                           "4 - Remove contact\n" +
                           "5 - Query if contact exists\n" +
                           "6 -  Print available actions");
        System.out.println("Choose your action: ");

    }

    private static void startPhone() {
        System.out.println("Google");
    }

    private static void printListOfContacts() {
        mobilephone.printListOfContacts();
    }

    private static void addContact() {
        System.out.println("Enter the contact to add.\n Enter contact name:");
        String name = scanner.nextLine();
        Contact existingContact=mobilephone.queryContact(name);
        if(existingContact!=null)
        {
            System.out.println("Contact already exists, hence cannot add");
            return;
        }
        System.out.println("Enter contact phone number:");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);

        if (mobilephone.addContact(newContact))
            System.out.println("Contact " + newContact.getName() + " has been added successfully.");
        else
            System.out.println("Contact " + newContact.getName() + " was not added as it was already on file.");

    }

    private static void updateContact() {
        System.out.println("Enter the old contact to update.\n Enter contact name:");
        String name = scanner.nextLine();
       // System.out.println("Enter contact phone number to update:");
        //String phoneNumber = scanner.nextLine();
        //Contact oldContact = Contact.createContact(name, phoneNumber);
       Contact oldContact= mobilephone.queryContact(name);
        if (oldContact==null) {
            System.out.println("The contact " + name + " was not found");
            return;
        }

        System.out.println("Enter the new contact to update.\n Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number:");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        //

        Contact contact=mobilephone.queryContact(newName);
        //System.out.println("contactName :"+contact.getName());
        if(contact!=null)
        {
            System.out.println("The new contact "+ contact.getName()+" same as an existing contact in the contact list");
            System.out.println("Update unsuccessful");
            return;
        }

        //
        if(mobilephone.updateContact(oldContact, newContact))
            System.out.println("Update successful");
        else
            System.out.println("Error updating the contact");


    }

    private static void removeContact() {
        System.out.println("Enter the contact to remove.\n Enter contact name:");
        String name = scanner.nextLine();
        // System.out.println("Enter contact phone number to update:");
        //String phoneNumber = scanner.nextLine();
        //Contact oldContact = Contact.createContact(name, phoneNumber);
        Contact oldContact= mobilephone.queryContact(name);
        if (oldContact==null) {
            System.out.println("The contact " + name + " was not found");
            return;
        }
    if(mobilephone.removeContact(oldContact))
        System.out.println("Remove contact successful");
    else
        System.out.println("Error removing contact");
    }

    private static void queryContact() {
        System.out.println("Enter the contact to search for.\n Enter contact name:");
        String name = scanner.nextLine();
        Contact searchContact=mobilephone.queryContact(name);
        if (searchContact!=null)
            System.out.println("The contact " + name + " was found in phones contact list with phone number: "+searchContact.getPhoneNumber());
        else
            System.out.println("The contact " + name + " was not found.");
    }
}
