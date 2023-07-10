package loginDetails;

public class ConsoleLogin {

	String userId;
	String password;
	int attempts;

	void checkUserId() {

		while (attempts > 0) {
			if (userId.equals(userId) && (password.equals(password)))

			{
				System.out.println("Login was succesfull");

				break;
			} else 
			{
				attempts--;
				System.out.println("Invalid user name or password");

				System.out.println("remaining attempts: " + attempts);
			}
		}
		if (attempts == 0) {
			System.out.println("Account locked");
		}

	}
}
