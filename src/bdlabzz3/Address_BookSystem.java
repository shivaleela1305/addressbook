package bdlabzz3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Address_BookSystem {
	private HashMap<String,ArrayList<Contact_details>>addressBooks;
	
	public Address_BookSystem(){
		addressBooks = new HashMap<>();
		
	}
	
	public void createAddressBook(String name) {
		addressBooks.put(name, new ArrayList<>());
		System.out.print("Address book" + name + "created");
	}
	
	
	//display the contact to the address book
	void display_Data(String addressBookName) {
		if(addressBooks.containsKey(addressBooks)) {
			ArrayList<Contact_details>contacts = addressBooks.get(addressBooks);
		    for(Contact_details contact : contacts) {
		    	System.out.println(contacts);
		    }
		}
		else {
			System.out.println("Address book" + addressBookName + "does not exist.");
		}
		
	}
	//uc2:add new contact to the address book
	void add_Contact(String addressBookName, Contact_details contact){
		
		if(addressBooks.containsKey(addressBookName)) {
			addressBooks.get(addressBookName).add(contact);
			System.out.println("Contact added to address book" + addressBookName + ".");
		}
		else {
			System.out.println("Adress book" + addressBookName + "does not exist.");
		}
	}
	
	//uc3:editing the contact
	void edit_Contact(String addressBookName , String first_name) {
		if(addressBooks.containsKey(addressBookName)) {
			ArrayList<Contact_details> contacts = addressBooks.get(addressBookName);
			for(Contact_details contact : contacts) {
				if(contact.getFirst_name().equals(first_name)) {
					Scanner scan = new Scanner(System.in);
					System.out.println("Enter new details for contact" + first_name + ":");
					contact.setFirst_name(scan.nextLine());
					contact.setLast_name(scan.nextLine());
					contact.setAddress(scan.nextLine());
					contact.setCity(scan.nextLine());
					contact.setState(scan.nextLine());
					contact.setZip(scan.nextLine());
					contact.setPhone_no(scan.nextLine());
					contact.setEmail_id(scan.nextLine());
				}
			}
		}else {
			System.out.println("Adress book" + addressBookName + "does not exist.");
		}
					
	}
	//uc4:deleting the contact
	void delete_Contact(String addressBookName , String first_name) {
		if(addressBooks.containsKey(addressBookName)) {
			ArrayList<Contact_details> contacts = addressBooks.get(addressBookName);
			contacts.removeIf(contact -> contact.getFirst_name().equals(first_name));
			System.out.println("contact" + first_name + "deleted from address book" + "addressBookName" + ".");
			}
		else {
			System.out.println("Adress book" + addressBookName + "does not exist.");
		}
		
	}

}
