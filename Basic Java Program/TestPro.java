import java.util.Scanner;
class TestPro{

//1.Accept 3 numbers and print its largest
	public void ThreeNoLarge(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter the third number: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
		System.out.println(num1 + " is the largest.");
		} 
		else if (num2 > num1 && num2 > num3){
			System.out.println(num2 + " is the largest.");
		} 
		else if (num3 > num1 && num3 > num2){
			System.out.println(num3 + " is the largest.");
		} 
		else {
			System.out.println("Two or more numbers are equal and largest.");
		}
	}

//2.Accept a number and print its factorial.......it is product of all positive whole no from 1to that no. 3=3*2*1  
	public void Factorial(){
		System.out.println("Enter any number to check factorial");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int fact =1;
		for(int i=1; i<=no; i++){
			fact = fact*i;
		}
		System.out.println(" The factorial of " + no + " is " + fact);
		//System.out.printf("\nThe factorial of %d is %d" ,no,fact);
	}

//3.Accept a number and print whether it is Prime number or not......it is a no that can only be divided by 1 and itself

	public void Prime(){
		System.out.println("Enter Any Number to check prime");
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
	}

//4.Accept a number and print its reverse.....
	public void Reverse(){
		int no;
		System.out.println("\nEnter the number for reversing the order : " );
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt(); 
		int reversed = 0;
		while(no != 0){    //(no > 0 )
			int digit = no % 10; 
			reversed =  reversed * 10 + digit ;
			no /= 10;  //no = no/10
		}
		System.out.println("Reversed number : " +reversed);
	}

//5.Accept a number and print whether it is Palindrome number or not.....it is a word,no or phrase that reads the same backward as forward.
		
	public void Palindrome(){
		int no;
		System.out.println("Enter any Number to check Palindrome");
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
			System.out.println("The Number is Palindrome");
		}
		else{
			System.out.println("The Number is Not Palindrome");
		}
	}

//6.Accept a number and print the given number of elements in Fibonacci series......it is a list of numbers where each no is the sum of two no before it.
	
	public void Fibonacci(){
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

//7.Accept a number and print whether it is Armstrong number or not........it is no where the sum of its digits to theri own power adds up to the number itself.

//8.Write a program to print FizzBizz series upto 100........FizzBizz series is a list of no where no div 3 are replaced with fizz and no div by 5v are replaced with Bizz and no div by both replaced with fizzbizz

 	public void FizzBizz(){
		for(int i=1;i<=100;i++){
			
		if(i%3==0 && i%5==0){
		System.out.print("FizzBizz");
		}

			if(i%3==0){
			
			System.out.print("Fizz");
			}
			else if(i%5==0){
			System.out.print("Bizz");			
			}
			
				System.out.print(i + " ");
		}
	}

//9.Write a program to print sum of all numbers from 1 to 100.

	public void SumofNumbers(){
        	int sum = 0;
	        	for (int i = 1; i <= 100; i++) {
            		sum += i; // Add the current number to the sum
       		}
		        System.out.println("The sum of all numbers from 1 to 100 is: " + sum);
   	 }

	public static void main(String [] args){
		TestPro t1 = new TestPro();
		t1.FizzBizz();
		t1.ThreeNoLarge();
		t1.Factorial();
		t1.Prime();
		t1.Reverse();
		t1.Palindrome();
		t1.SumofNumbers();
		t1.Fibonacci();
	}
}