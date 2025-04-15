import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String");
		String s1= sc.next();
		/*for(int i=0; i<s1.length(); i++) {
		System.out.println(s1.charAt(i));
		}*/
		for(int i=s1.length()-1 ; i>=0 ; i--){
		 System.out.println((s1.charAt(i)+"").repeat(3));
		 }
		 
	}

}
