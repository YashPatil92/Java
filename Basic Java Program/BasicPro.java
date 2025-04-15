import java.util.Scanner;
class BasicPro{
	Scanner sc = new Scanner(System.in);
	public void Palindrome(){
		int no;
		System.out.println("Enter the number for checking Palindrome : " );
		no = sc.nextInt();
		int org = no;
                   
		int reversed = 0;
		while(no != 0){    //(no > 0 )
			int digit = no % 10; 
			reversed =  reversed * 10 + digit ;
			no /= 10;  //no = no/10
		}
		//System.out.println("Reversed number : " +reversed);
		if (org == reversed){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}


	public void Fibonacci(){
               	System.out.println("Enter the number which you have to print it's fab series : ");
		int terms = sc.nextInt();
		int a = 0;
		int b = 1, c;
		System.out.print(a+ " " +b);
		for(int i=3; i<=terms; i++){
			 c = a + b;
			System.out.print(" "+c );
			a = b;
			b = c;
		}

	}

	public void Reverse(){
		int no;
		System.out.println("\nEnter the number for reversing the order : " );
		no = sc.nextInt(); 
		int reversed = 0;
		while(no != 0){    //(no > 0 )
			int digit = no % 10; 
			reversed =  reversed * 10 + digit ;
			no /= 10;  //no = no/10
		}
		System.out.println("Reversed number : " +reversed);
	}

	public void Factorial(){
		System.out.println("Enter any number to find it's factorial : ");
		int no = sc.nextInt();
		int fact = 1;
			for(int i=1; i<=no; i++){
				fact = fact * i;
			}
			System.out.println("Factorial of " + no + " is " +(fact));
	}

	public void Evenodd(){
		System.out.println("Enter a number fo even and odd : ");
		int num = sc.nextInt();
		if( num % 2 == 0){
		 	System.out.println(num + " is even . ");
		} else {
			System.out.println(num + " is odd. ");
		}
	}

	public void Positivenegi(){
		System.out.println("Enter a number to check positive or negative: ");
		int num = sc.nextInt();
		if ( num > 0){
			System.out.println("positive number is : " +num);
		} else if( num < 0){
			System.out.println("negative number is : " +num);
		} else {
			System.out.println("the number is zero.");
		}
	}

	public void PassFail(){
		int Marks;
		Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your Maths Marks");
			Marks = sc.nextInt();
		if(Marks>=35){
			System.out.println("You are Pass");	
		}
		else{
			System.out.println("You are Fail");
		}
	}

	public void fizzBizz(){
		for(int i=1; i<=100; i++){
			if(i%3 == 0 && i%5 == 0){  
				System.out.print(" FizzBizz ");
			}
			if(i%3 == 0){  
				System.out.print(" Fizz ");
			}
			else if(i%5 == 0){ 
				System.out.print(" Bizz ");
			}
			else{
			System.out.print(i+ "  ");
			}
		}

	}

	public static void main(String [] args){
		BasicPro p1 = new BasicPro();
		p1.Palindrome();
		p1.Fibonacci();
		p1.Reverse();
		p1.Factorial();
		p1.Evenodd();
		p1.Positivenegi();
		p1.PassFail();
		p1.fizzBizz();
	}
}