import java.util.Scanner;

class Table{
	public static void main(String[] args){
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int ctr=1;
		while(ctr<=10){
			System.out.println(no*ctr);
			ctr=ctr+1;
		}
	} 
}
//ctr counter