package loginDetails;

import java.util.Scanner;

public class ConsoleLoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsoleLogin chances = new ConsoleLogin();
		
				Scanner sc = new Scanner(System.in);
				
				chances.attempts=3;
				chances.password= "Admin123";
				chances.userId= "pivotAdmin";
				
				
				
					System.out.println("Enter your Username");
					chances.userId = sc.nextLine();
					
			
					System.out.println("Enter your password");
					chances.password = sc.nextLine();
					
				
				chances.checkUserId();
	}

}
