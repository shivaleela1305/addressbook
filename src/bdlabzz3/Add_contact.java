package bdlabzz3;

import java.util.ArrayList;
import java.util.Scanner;

public class Add_contact {
	
	ArrayList<Contact_details> list = new ArrayList<Contact_details>(); 
	
	//display the contact to the address book
	void display_Data() {
		
		//for(Contact_details contacts : list) {
			System.out.println(list);
		//}
	
		
	}
	//add new contact to the address book
	void add_Contact(){
		Contact_details contact = new Contact_details();
		Scanner scan = new Scanner(System.in);
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
	
	//edit the contact using person first name of the address book  
	void edit_Contact() {
		boolean isPerson_found=false;
		int indexofPerson=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name for editing an existing contact:");
		String first_name1 = scan.next();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getFirst_name().equals(first_name1));
			if(list.get(i).getFirst_name().equals(first_name1)) {
				isPerson_found=true;
				indexofPerson=i;
				break;
			}
		}
		if(isPerson_found ) {
			System.out.println("modify first name:");
			list.get(indexofPerson).setFirst_name(scan.next());
            System.out.println("modify Last Name: ");
            list.get(indexofPerson).setLast_name(scan.next());
            System.out.println("modify address: ");
            list.get(indexofPerson).setAddress(scan.next());
            System.out.println("modify city: ");
            list.get(indexofPerson).setCity(scan.next());
            System.out.println("modify state: ");
            list.get(indexofPerson).setState(scan.next());
            System.out.println("modify zip code: ");
            list.get(indexofPerson).setZip(scan.next());
            System.out.println("modify phone number: ");
            list.get(indexofPerson).setPhone_no(scan.next());
            System.out.println("modify email_id: ");
            list.get(indexofPerson).setEmail_id(scan.next());
		}
		else {
			System.out.println("name not found enter the proper name");
			}
	}
	
	
}