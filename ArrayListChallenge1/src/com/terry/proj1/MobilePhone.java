package com.terry.proj1;

import java.util.ArrayList;

public class MobilePhone {
    private String phoneNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }


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




        public void printListOfContacts()
        {
            for(int i=0;i<myContacts.size();i++) {
                //System.out.println("You now have "+ myContacts.size()+" contact(s)");
                System.out.println("Contact # " + (i + 1) + " is " + myContacts.get(i).getName()+ " -> phone number : "+myContacts.get(i).getPhoneNumber());
            }

        }
    public  boolean addContact(Contact newContact)
    {
        if(findContact(newContact.getName())<0) {
            myContacts.add(newContact);
            return true;
        }
        else
            System.out.println("Contact already exists");
        return false;
    }


    public  boolean updateContact(Contact oldContact, Contact newContact)
    {
        int position=findContact(oldContact.getName());
if(position>=0) {
    myContacts.set(position, newContact);
    System.out.println(oldContact.getName()+ " was replaced with "+ newContact.getName());
    return true;
}
        else
        System.out.println("Contact "+ oldContact.getName()+" does not exist in the existing contacts list");
        return false;

    }
    public boolean removeContact(Contact contact)
    {
        //int position=findContact(contact);
       // if(position>=0) {
            myContacts.remove(contact);
            System.out.println(contact.getName()+ " was deleted.");
            return true;
       // }
       // else
          //  System.out.println("Contact "+ contact.getName()+" does not exist in the existing contacts list");
       // return false;
    }

    public  Contact queryContact(String contactName)
    {
        int position =findContact(contactName);
        if(position>=0)
            return myContacts.get(position);
        else
            return null;
    }

    public  String queryContact(Contact contact)
    {

       int position =findContact(contact);
       if(position>=0)
           return contact.getName();
       else
           return null;
    }

    private  int findContact(Contact contact)
    {
        int position =myContacts.indexOf(contact);
        return position;
    }
    private  int findContact(String contactName)
    {
for(int i=0; i<myContacts.size();i++)
{
    String name=myContacts.get(i).getName();
    if(name.equals(contactName))
        return i;
}
   return -1;
    }


}
