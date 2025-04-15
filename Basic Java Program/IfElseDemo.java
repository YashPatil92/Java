import java.util.Scanner;

class IfElseDemo{
	public static void main(String[] args){
	int temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your body temperature");
	temp = sc.nextInt();
	
	if(temp>100){
		System.out.println("You have high fever");
		System.out.println("Please visit any doctor");
		System.out.println("Please take medicines");
		System.out.println("Get well soon");
	}
	else{
		System.out.println("You are healty");
		System.out.println("keep it up");
}
}
}