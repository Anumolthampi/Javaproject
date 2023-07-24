package constructorExample;

import java.util.Scanner;

public class BookMain{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book harryPotter = new Book("JK_Rowling", "Goblet_of_fire", false);
        Book famousFive = new Book("Andy_Blyton", "On_an_Island", false);
        Book fivePointSomeone = new Book("Chetan_Bhagat", "Five_Point_Someone", false);
        Book iceAndFire = new Book("R_Martin", "Ice_and_Fire", false);
        Book lordOfTheRings = new Book("JR", "Lord_of_the_Rings", false);
        Book[] namesOfTheBook = {harryPotter, famousFive, fivePointSomeone, iceAndFire, lordOfTheRings};

        int issuedBooks = 0;

        do {
            System.out.println("Enter the name of the book that you want to be issued"); 
            String bookName = sc.next();
          
            boolean isbookFound = false;

            for (int i = 0; i < namesOfTheBook.length; i++) {
//                if (namesOfTheBook[i].bookName.equals(bookName)) {
            	if (namesOfTheBook[i].bookName.equals(bookName)) {
                    if (namesOfTheBook[i].isBookIssued) {
                        System.out.println("The book " + bookName + " is either already issued or does not exist in the library.");
                    } else {
                        namesOfTheBook[i].isBookIssued = true;
                        System.out.println(bookName + " has been issued.");
                        issuedBooks++;
                    
                    isbookFound = true;
                    break;
                }
                }
            }

            if (!isbookFound) {
                System.out.println("The book " + bookName + " does not exist in the library.");
            }

        } while (issuedBooks < 3);

        System.out.println("You have reached the maximum number of issued books (3). Thank you for using the library!");
    }
}
