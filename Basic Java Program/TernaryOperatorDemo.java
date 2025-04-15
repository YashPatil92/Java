import java.util.Scanner;

class TernaryOperatorDemo{
	public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a");
		a= sc.nextInt();
		System.out.println("Enter Value of b");
		b= sc.nextInt();
		// exp1
		int c =a>b ? a:b;
		System.out.println("The largest number : " + c);
	}
}

