//Accept 3 no and print which is largest
import java.util.Scanner;

//class LargestOfThree {
class LargestNumber{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		
		int no1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		
		int no2 = scanner.nextInt();
		System.out.print("Enter the third number: ");
		
		int no3 = scanner.nextInt();
		if (no1 > no2 && no1 > no3) {
		System.out.println(no1 + " is the largest number.");
		} 
		else if (no2 > no1 && no2 > no3){
			System.out.println(no2 + " is the largest number.");
		} 
		else if (no3 > no1 && no3 > no2){
			System.out.println(no3 + " is the largest number.");
		} 
		else {
			System.out.println("Two or more numbers are equal and largest.");
		}
		scanner.close();
	}
}

/*
import java.util.Scanner;
class LargestNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int no1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int no2 = sc.nextInt();

		System.out.println("Enter third number: ");
		int no3 = sc.nextInt();

		int largest = no1;
		if (no2> largest){
			largest = no2;
		}
		if (no3>largest){
			largest = no3;
		}
		System.out.println("The largest number is: " + largest);
	}
}
*/
