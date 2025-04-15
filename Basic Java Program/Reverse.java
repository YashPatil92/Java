import java.util.Scanner;

class Palindrome{
	public static void main(String[] args){
		int no;
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		int org=no;
		int rev = 0;
		while (no != 0) {
    		int digit = no % 10; //module opertaor always gives last didgit
    		rev = rev * 10 + digit;
    		no=no/10;  // dividing by 10 will always give number after removing last digit
		}
		System.out.println("Reversed number: " + rev);
		if(org==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}

	}
}


/*
no  digit  rev
0    1     531
*/