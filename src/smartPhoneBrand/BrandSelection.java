package smartPhoneBrand;

import java.util.Scanner;

public class BrandSelection {
	String brand;
	String chooseBrand;
	String choosePhone;
	String enteredPhone;
	boolean flag = false;

	String[] samsung = { "s20", "s21", "s23", "flip", "fold" };
	String[] google = { "googlepixel", "googlepixel7", "googlepixel8", "googlepixel6" };
	String[] apple = { "iphone11", "iphone12", "iphone13", "iphone14" };

	void display() {
		System.out.println("Choose a brand of your choice from Apple, Samsung, Google");
		Scanner sc = new Scanner(System.in);
		enteredPhone = sc.nextLine();

		if (enteredPhone.equalsIgnoreCase("apple")) {
			for (String phonemodel : apple)
				System.out.println(phonemodel);
		} else if (enteredPhone.equalsIgnoreCase("samsung")) {
			for (String phonemodel : samsung)
				System.out.println(phonemodel);
		} else if (enteredPhone.equalsIgnoreCase("google")) {
			for (String phonemodel : google)
				System.out.println(phonemodel);
		}

		else {
			System.out.println("Choose a brand from the list");
		}
	}

	void selectPhone() {
		System.out.println("Choose a phone of your choice");
		Scanner sc = new Scanner(System.in);
		choosePhone = sc.nextLine();
		switch (choosePhone.toLowerCase()) {
		case "apple":
			for (String phoneModel : apple) {
				if (choosePhone.equalsIgnoreCase(phoneModel)) {
					flag = true;
					break;
				}
			}

		case "samsung":
			for (String phoneModel : samsung) {
				if (choosePhone.equalsIgnoreCase(phoneModel)) {
					flag = true;
					break;
				}
			}
		case "google":
			for (String phoneModel : google) {
				if (choosePhone.equalsIgnoreCase(phoneModel)) {
					flag = true;
					break;
				}
			}

		default: {
			System.out.println("Thanks for reaching out");
		}
			if (flag=true) {
				System.out.println("The phone is " + choosePhone + " is  available");
			}
			else
			{
				System.out.println("The phone is " + choosePhone + " is  not available");
			}
		}
		sc.close();
		return;
	}

}
