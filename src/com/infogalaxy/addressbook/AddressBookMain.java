package com.infogalaxy.addressbook;
import java.util.Scanner;
public class AddressBookMain {

	Scanner scanner = new Scanner(System.in);
	Contact contact = new Contact();
	
	public void addContact() {
		System.out.println("Enter the First Name");
		contact.setFirstName(scanner.next());
		
		System.out.println("Enter Last Name");
		contact.setLastName(scanner.next());
	
		System.out.println("Enter Address");
		contact.setAddress(scanner.next());
	
		System.out.println("Enter city");
		contact.setCity(scanner.next());
		
		System.out.println("Enter State");
		contact.setState(scanner.next());
	
		System.out.println("Enter Zip");
		contact.setZip(scanner.next());
		
		System.out.println("Enter Phone Number");
		contact.setPhoneNumber(scanner.next());
	
		System.out.println("Enter Email");
		contact.setEmail(scanner.next());
	}
	
	public void showContact() {
		System.out.println(contact.getFirstName());
		System.out.println(contact.getLastName());
		System.out.println(contact.getAddress());
		System.out.println(contact.getCity());
		System.out.println(contact.getState());
		System.out.println(contact.getZip());
		System.out.println(contact.getPhoneNumber());
		System.out.println(contact.getEmail());
	}
	public static void main(String[] args) {
		AddressBookMain obj = new AddressBookMain();
		
		obj.addContact();
		obj.showContact();
		
		
	}

}
