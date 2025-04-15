import java.util.Scanner;

class PassFail{
	public static void main(String[] args){
	int Marks;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your Maths Marks");
	Marks = sc.nextInt();
	if(Marks>=35){
		System.out.println("You are Pass");	}
	else{
		System.out.println("You are Fail");
}
}
}
