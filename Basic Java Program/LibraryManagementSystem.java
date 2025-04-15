import java.util.*;

public class LibraryManagementSystem {

private static ArrayList<String>books = new ArrayList<>();
private static HashSet<String> borrowdBooks =new HashSet<>();
private static LinkedList<String> userQueue = new LinkedList<>();
private static HashMap<String, String> userBorrowedBooks = new HashMap<>();

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int choice;

	books.add("The Alchemist");
	books.add("To Kill a Mockingbird");
	books.add("1984");
	books.add("Moby Dick");
	books.add("The Great Gatsby");

	while (true){
	System.out.println("\n==== Library Management System ====");
	System.out.println("1.Add a Book");
	System.out.println("2.View All Books");
	System.out.println("3.Register User");
	System.out.println("4.Borrow a Book");
	System.out.println("5.Return a Book");
	System.out.println("6.View Borrowed Books");
	System.out.println("7.Exit");
	System.out.println("Enter your choice:");
	choice = scanner.nextInt();
	scanner.nextLine();

	switch (choice){
	case 1 ->addBook(scanner);
	case 2 ->viewBooks();
	case 3 ->registerUser(scanner);
	case 4 ->borrowBook(scanner);
	case 5 ->returnBook(scanner);
	case 6 ->viewBorrowedBooks();
	case 7 ->{
	System.out.println("Exiting the system. Goodbye!");
	scanner.close();
	System.exit(0);
}
	default ->System.out.println("Invalid choice. Please try again.");
}
}
}
}