import java.util.Scanner;

class PrimeNumber{
	public static void main(String[] args){
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i;
		for(i=2;i<no;i++){
			if(no%i==0){
				System.out.println("The number is not prime");
				break;
			}
		}
	if(i==no){
		System.out.println("The number is prime");
	}
	sc.close();
	}
}