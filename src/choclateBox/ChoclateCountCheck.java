package choclateBox;

public class ChoclateCountCheck {
	int initialchoclateNumber;
	int choclates;
	int finalChoclateNumber;

	void countCheck() {

		choclates = initialchoclateNumber;

		while (choclates < finalChoclateNumber)

		{
			choclates += 5;

			if (choclates > finalChoclateNumber) {
				choclates = finalChoclateNumber;

			}
			
			System.out.println("The number of choclates =" + choclates);
		}
		if (choclates == finalChoclateNumber)

		{
			System.out.println("Total number of Choclates= " + choclates);
			System.out.println("It is full");
		}
	}
	
}