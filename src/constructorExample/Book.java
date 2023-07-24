package constructorExample;

public class Book {
	boolean isBookIssued;
	 String bookName;
	 String nameOfAuthor;

	public Book(String nameAuthor, String nameBook, boolean isIssued) {

		bookName=nameBook;
		nameOfAuthor=nameAuthor;
		isBookIssued=isIssued;
		
	}


}
