package bdlabzz3;
import java.util.Scanner;
import java.util.ArrayList;



	

public class addressbook {

	public static void main(String[] args) {
		
		//greeting to the program
		System.out.println("WELCOME to adrress book program");
		Add_contact add = new Add_contact();
		add.add_Contact();
		add.display_Data();
		add.edit_Contact();
		add.display_Data();
		
	}
	

}
