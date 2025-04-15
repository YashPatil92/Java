import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int no = sc.nextInt();
		int fact =1;
		for(int i=1; i<=no; i++){
			fact = fact*i;
		}
		System.out.println(" The factorial of " + no + " is " + fact);
		System.out.printf("\nThe factorial of %d is %d" ,no,fact);
	}
}