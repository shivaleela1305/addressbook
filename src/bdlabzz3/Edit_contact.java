package bdlabzz3;

import java.util.ArrayList;
import java.util.Scanner;

public class Edit_contact {
	
	EditedContact_details contacts = new EditedContact_details();
	ArrayList<EditedContact_details> list = new ArrayList<EditedContact_details>(); 
	
	//display the contact to the address book
	void display_EditedData() {
		for(EditedContact_details contacts : list) {
			System.out.println(contacts);
		}
	}
	
		
		
	void edit_Contacts() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter details for editing an existing contact:");
			System.out.println("modify First Name: ");
            contacts.setFirst_name1(scan.next());
            System.out.println("modify Last Name: ");
            contacts.setLast_name1(scan.next());
            System.out.println("modify address: ");
            contacts.setAddress1(scan.next());
            System.out.println("modify city: ");
            contacts.setCity1(scan.next());
            System.out.println("modify state: ");
            contacts.setState1(scan.next());
            System.out.println("modify zip code: ");
            contacts.setZip1(scan.next());
            System.out.println("modify phone number: ");
            contacts.setPhone_no1(scan.next());
            System.out.println("modify email_id: ");
            contacts.setEmail_id1(scan.next());
            list.add(contacts);
        
	}

}
