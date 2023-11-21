package bdlabzz3;
import java.util.Scanner;
	

public class addressbook {

	public static void main(String[] args) {
		
		String first_name;
		String last_name;
	    String address;
	    String city;
	    String state;
	    String zip;
	    String phone_no;
	    String email_id;
		
		//greeting to the program
		System.out.println("WELCOME to adrress book program");
		//declaring how many records need to be entered
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of records that need to be added in address book:" );
		int n=scan.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("enter the first name:");
			first_name=scan.next();
			System.out.println("enter the last name:");
			last_name=scan.next();
			System.out.println("enter the address:");
			address=scan.next();
			System.out.println("enter the city:");
			city=scan.next();
			System.out.println("enter the state:");
			state=scan.next();
			System.out.println("enter the zip code of the residency:");
			zip=scan.next();
			System.out.println("enter the phone number:");
			phone_no=scan.next();
			System.out.println("enter the email_id:");
			email_id=scan.next();
		}
		scan.close();
		
	}

}
