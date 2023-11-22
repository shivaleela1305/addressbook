package bdlabzz3;

import java.util.ArrayList;
import java.util.Scanner;

public class Add_contact {
	Contact_details contact = new Contact_details();
	ArrayList<Contact_details> list = new ArrayList<Contact_details>(); 
	
	//display the contact to the address book
	void display_Data() {
		for(Contact_details contacts : list) {
			System.out.println(contacts);
		}
	
		
	}
	//add new contact to the address book
	void add_Contact(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of records that need to be added in address book:" );
		int n=scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("enter the first name:");
			contact.setFirst_name(scan.next());
			System.out.println("enter the last name:");
			contact.setLast_name(scan.next());
			System.out.println("enter the address:");
			contact.setAddress(scan.next());
			System.out.println("enter the city:");
			contact.setCity(scan.next());
			System.out.println("enter the state:");
			contact.setState(scan.next());
			System.out.println("enter the zip code of the residency:");
			contact.setZip(scan.next());
			System.out.println("enter the phone number:");
			contact.setPhone_no(scan.next());
			System.out.println("enter the email_id:");
			contact.setEmail_id(scan.next());
			list.add(contact);
	      }
	}

}
