package OntarioLicence;

public class Licence {
	int age;
	String ontarioLicense;
	String level;

	void checkLicenceType() {
		if ((age >= 16) && ontarioLicense.equalsIgnoreCase("G1")) {
			System.out.println("Eligible for G2 and G");
		} else if (ontarioLicense.equalsIgnoreCase("G2")) {
			System.out.println("Eligible for G");
		} else if (ontarioLicense.equalsIgnoreCase("G")) {
			System.out.println("You have full Licence G ");
		}

		else {
			System.out.println("You are not eligible for a learners License");
		}

		return;

	}
}
