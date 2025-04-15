import java.util.Scanner;

class Name{
	public void printname(String name){
		for(int i=1;i<=10;i++){
			System.out.println(i + ". " + name);
			
		}	
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			Name o = new Name();
        		o.printname(name);
	}
}

/*import java.util.Scanner;

public class PrintNameWithScanner {
    // Method to print the name 10 times
    public static void printName(String name) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + name);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Call the method to print the name
        printName(name);

        // Close the scanner
        scanner.close();
    }
}*/
