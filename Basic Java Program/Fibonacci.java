import java.util.Scanner;

	class Fibonacci{
	public static void main(String[] args){
		int terms;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of terms from Fibonacci series");
		terms = sc.nextInt();
		int a=1,b=1,c;
		System.out.print(a+" "+b);
		for(int i=3; i<=terms; i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
