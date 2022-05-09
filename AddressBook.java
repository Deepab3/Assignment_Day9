package com.bridgelabz.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner scanner = new Scanner(System.in);  // scanner will be allocated memory when class is loaded

    ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>(); // instance variable of array list-- collection

    public void addContact() {
        Contacts contacts = new Contacts(); // to access contact class
        System.out.println("Enter First Name");
        String firstName = scanner.next();
        contacts.setFirstName(firstName);
        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        contacts.setLastName(lastName);
        System.out.println("Enter Email");
        String email = scanner.next();
        contacts.setEmail(email);
        System.out.println("Enter Phone Number");
        String phoneNumber = scanner.next();
        contacts.setPhoneNumber(phoneNumber);
        System.out.println("Enter Zip");
        String zip = scanner.next();
        contacts.setZip(zip);
        System.out.println("Enter City");
        String city = scanner.next();
        contacts.setCity(city);
        System.out.println("Enter State");
        String state = scanner.next();
        contacts.setState(state);
        System.out.println("Enter Address");
        String address = scanner.next();
        contacts.setAddress(address);
        contactsArrayList.add(contacts); // contacts list will be added to the array list
        System.out.println(contacts.toString());  // tostring method is called from object class

    }

    public void editContact() {
        System.out.println("Enter First Name of the contact you want to edit");
        String firstName = scanner.next();
        boolean flag = false;
        for (Contacts contact:contactsArrayList) {
            if (firstName.equals(contact.getFirstName())){
                contact.editContact();
                System.out.println("Contact edited successfully!");
                flag = true;
                break;
            }
        }
        if (flag == false){
            System.out.println("The contact with first name :"+firstName+" is not found!");
        }
    }
}
