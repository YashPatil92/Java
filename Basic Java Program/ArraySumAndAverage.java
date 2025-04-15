import java.util.Scanner;

class ArraySumAndAverage{
	public static void main(String[] args){
		//int [] a = new int[10];
		int [] amt = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the daily amount you received from company for one week");
		for(int i=0;i<7;i++){
			amt[i]=sc.nextInt();
		}
		System.out.println("Your daily income is as follow: ");
		int total=0;
		for(int i=0;i<7;i++){
			System.out.println(amt[i]);
			total=total+amt[i];
		}
		System.out.println("Your total income of week :" + total);
		System.out.println("Your average income of week :" + total/7);	
	}
}