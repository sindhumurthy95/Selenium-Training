package week1.day2;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	//create object for the Library Class
	public static void main(String[] args) {
		Library lb=new Library();
		System.out.println(lb.addBook("Memoir"));
		lb.issueBook();

	}

}