package OntarioLicence;

import java.util.Scanner;

public class LicenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Licence eligibility = new Licence();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");

		eligibility.age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the License G1, G2, G ");

		eligibility.ontarioLicense = sc.nextLine();

		eligibility.checkLicenceType();

		sc.close();

	}

}
