import java.util.Scanner;

public class StringPalindrome2 {

	public static void main(String[] args) {
		/*String s1 = "Hello Java";
		StringBuilder s2 = new StringBuilder(s1);
		s2.reverse();
		if(s1.equals(s2.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}*/
		int no;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		no=sc.nextInt();
		String s=no+"";
		StringBuilder s3=new StringBuilder(s);
		s3.reverse();
		if(s.equals(s3.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
