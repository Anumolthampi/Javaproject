package findNamesInAnArray;

import java.util.Scanner;

public class ProgramUpdate {
	String enteredName;
	int i;

	String[] namesOfStudents = new String[10];
	int count = 0;
	Scanner sc = new Scanner(System.in);
	// Print Values In the Array

	void populateStudentNames() {

		for (int i = 0; i < 10; i++) {
			System.out.println(" Enter The Name of the Student :  " + (i + 1));
			namesOfStudents[i] = sc.next();
		}
	}

	void printNames() {

		for (int i = 0; i < namesOfStudents.length; i++) {
			System.out.println((namesOfStudents[i]));
		}
	}

	void findNamesOfStudent() {
		System.out.println("Enter the Name You want to Search:  " );
		enteredName = sc.next();

		for (i = 0; i < namesOfStudents.length; i++)

		{

			if (enteredName.equals(namesOfStudents[i])) {
				count++;
				if (count > 0)
				{
				System.out.println( enteredName + " is Present in the Array " + " " + count + " times");
			}
			break;
			}
	
		else {
			System.out.println("Name is not Present in the Array");
		}
			break;

	}
	}
}

