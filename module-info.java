import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the book program!");
		
		System.out.println("Would you like to create a book object?(yes/no):"); //scans id
		String choice = scan.nextLine();
		
		if (choice == yes) {
			//do stuff
		}	
		else if (choice == no) { 
			//do stuff
		}
		else {
			System.out.println("Oops! That's not a valid entry. Please try again: ");
		}
		
		System.out.println("Please enter the author, title, and the isbn of the book separated by /: "); //scans payrate
		String input =scan.nextLine;
		if (input == yes) {
			//do stuff
		}	
		else if (choice == no) { 
			//do stuff
		}
		else {
			System.out.println("Oops! That's not a valid entry. Please try again: ");
		}
		
		System.out.println("Got it!");
		System.out.println("Now, tell me if it is a bookstore book or a library book (enter BB for bookstore book or LB for library book):");
		String BorL =scan.nextLine;
		if (choice == yes) {
			//do stuff
		}	
		else if (choice == no) { 
			//do stuff
		}
		else {
			System.out.println("Oops! That's not a valid entry. Please try again: ");
		}
		System.out.println("Got it!");
		
		
		System.out.println("Please enter the list price of" + Title + " by " + Author + ":");
		String price =scan.nextLine;
		if (choice == yes) {
			//do stuff
		}	
		else if (choice == no) { 
			//do stuff
		}
		else {
			System.out.println("Oops! That's not a valid entry. Please try again: ");
		}
		System.out.println("Got it!");
		
		
		System.out.println("Is it on sale? (y/n): ");
		String sale =scan.nextLine;
		if (sale == y) {
			//do stuff
		}	
		else if (sale == n) { 
			//do stuff
		}
		else {
			System.out.println("Oops! That's not a valid entry. Please try again: ");
		}
		System.out.println("Got it!");
		
		
		System.out.println("Deduction percentage: ");
		Double deduct =scan.nextLine;
		if (deduct == y) {
			//do stuff
		}	
		else if (sale == n) { 
			//do stuff
		}
		else {
			System.out.println("Oops! That's not a valid entry. Please try again: ");
		}
		System.out.println("Got it!");
	
		System.out.println("Here are all your books...");
		System.out.println("Library Books" + "(" + num + ")");
		//print books
		System.out.println("----");
		
		System.out.println("Bookstore Books" + "(" + num + ")");
		//print bookstore books
		
		System.out.println("----");
		
		System.out.println("Take care now!");
		
		scan.close();
	}
}

class BookstoreBook{
	private String Author;
	private String Title;
	private String Isbn;
	
	public book(double price, double sale){
		setAuthor(Author);
		setTitle(Title);
		setIsbn(Isbn);
	}
	
	public void printCheck () {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Here is you bookstore book information");
		System.out.println("[" + Title + " by " + Author + "," + price + " listed for " + deductr + "]");
	}	
	
	public void changeAuthor (String newAuthor) {
		Author = newAuthor;
	}
	public void changeTitle (String newTitle) {
		Title = newTitle;
	}
	public void changeIsbn (String newIsbn) {
		Isbn = newIsbn;
	}
	public String getAuthor() {
		return Author;
	}
	public String getTitle() {
		return Title;
	}
	public String getIsbn() {
		return Isbn;
	}
	public void setName(String newAuthor) {
		this.Author = newAuthor;
	}
	public void setTitle(String newTitle) {
		this.Title = newTitle;
	}
	public void setIsbn(String Isbn) {
		this.Isbn = newIsbn;
	}

	@Override
	public String toString() {
		return ("["+employeeNumber+"/"+fullName+", "+ hoursWorked + " Hours @ " + payRate + " per hour"+"]");
	}
}

class LibraryBook {
	private String Author;
	private String Title;
	private String Isbn;
	
	public bookTwo (double callNum) {
		setAuthor(Author);
		setTitle(Title);
		setIsbn(Isbn);
}
	public void printCheck () {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Here is your library book information");
		System.out.println("[" + Title + " by " + Author + //something);
	}	
	
	public void changeAuthor (String newAuthor) {
		Author = newAuthor;
	}
	public void changeTitle (String newTitle) {
		Title = newTitle;
	}
	public void changeIsbn (String newIsbn) {
		Isbn = newIsbn;
	}
	public String getAuthor() {
		return Author;
	}
	public String getTitle() {
		return Title;
	}
	public String getIsbn() {
		return Isbn;
	}
	public void setName(String newAuthor) {
		this.Author = newAuthor;
	}
	public void setTitle(String newTitle) {
		this.Title = newTitle;
	}
	public void setIsbn(String Isbn) {
		this.Isbn = newIsbn;
	}

	@Override
	public String toString() {
		return ("["+employeeNumber+"/"+fullName+", "+ hoursWorked + " Hours @ " + payRate + " per hour"+"]");
	}

}
