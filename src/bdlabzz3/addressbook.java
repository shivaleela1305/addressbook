package bdlabzz3;
import java.util.Scanner;
import java.util.ArrayList;



	

public class addressbook {

	public static void main(String[] args) {
		
		//greeting to the program
		System.out.println("WELCOME to adrress book program");
		Add_contact add = new Add_contact();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an option (1, 2, or 3):" );
		int option = scan.nextInt();
		switch(option) {
		case 1:
			add.add_Contact();
			add.display_Data();
			break;
		case 2:
			add.edit_Contact();
			add.display_Data();
			break;
		case 3:
			add.delete_Contact();
			add.display_Data();
			break;
		default:
			System.out.println("Invalid option");
			break;
			
		}
		
	}
	

}
