package choclateBox;

public class ChoclateCountCheck {
	int initialchoclateNumber;
	int choclates;
	int finalChoclateNumber;

	Void countCheck()

	{

		choclates = initialchoclateNumber;

		while (choclates < finalChoclateNumber)

		{
			choclates += 5;

			if

			(choclates > finalChoclateNumber) {
				choclates = finalChoclateNumber;
			}
			System.out.println("The number of Choclates=" + choclates);
		}

		if (finalChoclateNumber == choclates) {
			System.out.println("Total number of choclates= " + choclates);
		} else {

			System.out.println("It if full");

		}
		return null;

	}
}
