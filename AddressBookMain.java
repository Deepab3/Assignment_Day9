package com.bridgelabz.day9;

public class AddressBookMain {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();  //object is created to access the address book method
        addressBook.addContact();
        addressBook.addContact();
        addressBook.addContact();
        System.out.println(addressBook.contactsArrayList);
        System.out.println("****************");

        addressBook.editContact();

        for (Contacts contact : addressBook.contactsArrayList) { //for (variable name which will represent the current obj :list or array where iteration will be done)
            System.out.println(contact);   // this wil call the two string method

        }
    }
}
