import java.util.Scanner;

class NoOfDigts{
	public static void main(String [] args){
	System.out.println("Please Enter Any Number");
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	if(no>=1 && no<=9){
		System.out.println("Number is 1 Digit Number");
	}
	else if(no>=10 && no<=99){
		System.out.println("Number is 2 Digit Number");
	}
	else if(no>=100 && no<=999){
		System.out.println("Number is 3 Digit Number");
	}
	else if(no>=1000 && no<=9999){
		System.out.println("Number is 4 Digit Number");
	}
	}
}

//nested ifelse....ifelse ladder