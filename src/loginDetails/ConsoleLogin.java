package loginDetails;

import java.util.Scanner;

public class ConsoleLogin {

	String userId;
	String password;
	int attempts;
	Scanner sc = new Scanner(System.in);

	void checkUserId(String enteredUserId, String enteredPassword) {

		while (attempts > 0) 
		
{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your Username");
			enteredUserId= sc.nextLine();

			System.out.println("Enter your password");
	    	enteredPassword = sc.nextLine();

			if (userId.equals(enteredUserId) && (password.equals(enteredPassword))) {
				System.out.println("Login succesfull, You are now Logged in to the application");

				break;

			} else {
				System.out.println("Invalid user name or password");
				attempts--;
				System.out.println("remaining attempts: " + attempts);
			}
}
			if (attempts == 0) {
				System.out.println("Account locked");
			}
		}

	}


