
import java.util.Scanner;

class SquareCube{
	public static void main(String [] args){
	//int no = 4;
	Scanner sc= new Scanner(System.in);
	System.out.println("Please Enter any Number");
	int no;
	no =sc.nextInt();
	
/*
float no;
no=sc.nextFloat();
*/

/*
char ch;
ch=sc.next().charAt(0);
*/

/*
String name;
name= sc.next();
*/

/*
String name;
name=sc.nextLine();
*/

System.out.println("My given number : "+ no);
System.out.println("Square : "+ no*no);
System.out.println("Cube : "+ no*no*no);

}
}