package bdlabzz3;
import java.util.Scanner;
import java.util.ArrayList;	

public class addressbook {

	public static void main(String[] args) {
		
		//greeting to the program
		System.out.println("WELCOME to adrress book program");
		Address_BookSystem system = new Address_BookSystem();
		Scanner scan = new Scanner(System.in);
		boolean running = true;
		while(running) {
			System.out.println("\nAddress Book System Menu:");
			System.out.println("1. Create Address Book");
			System.out.println("2. Add contact to Address Book");
			System.out.println("3. Display contacts in Address Book");
			System.out.println("4. Edit contact Address Book");
			System.out.println("5. Delete contact from Address Book");
			System.out.println("6.Exit");
			System.out.println("Choose an option");
			
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 1:
				System.out.print("Enter the name of the address book: ");
				String addressBookName = scan.nextLine();
				system.createAddressBook(addressBookName);
				break;
				
			case 2:
				System.out.print("Enter the name of the address book to add contact: ");
                String bookToAddContact = scan.nextLine();
                Contact_details newContact = new Contact_details();
                System.out.println("Enter contact details:");
                // Add input prompts for contact details here similar to the previous code
                system.add_Contact(bookToAddContact, newContact);
                break;

            case 3:
                System.out.print("Enter the name of the address book to display contacts: ");
                String bookToDisplay = scan.nextLine();
                system.display_Data(bookToDisplay);
                break;

            case 4:
                System.out.print("Enter the name of the address book to edit contact: ");
                String bookToEdit = scan.nextLine();
                System.out.print("Enter the first name of the contact to edit: ");
                String firstNameToEdit = scan.nextLine();
                system.edit_Contact(bookToEdit, firstNameToEdit);
                break;

            case 5:
                System.out.print("Enter the name of the address book to delete contact: ");
                String bookToDelete = scan.nextLine();
                System.out.print("Enter the first name of the contact to delete: ");
                String firstNameToDelete = scan.nextLine();
                system.delete_Contact(bookToDelete, firstNameToDelete);
                break;

            case 6:
            	 running = false;
                 System.out.println("Exiting Address Book System. Goodbye!");
                 break;

             default:
                 System.out.println("Invalid option. Please choose a valid option.");
                 break;
			}
		}
	}
	

}
