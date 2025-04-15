import java.util.Scanner;

class SumOfArray31{
	public static void main(String[] arg){
		int[] p1=new int[7];
		int[] p2=new int[7];
		int [] total=new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weekly sales of person1");
		for(int i=0;i<7;i++){
			p1[i]=sc.nextInt();
		}
		System.out.println("Enter the weekly sales of person2");
		for(int i=0;i<7;i++){
			p2[i]=sc.nextInt();
		}

		System.out.println("Total sales of both persons : ");
		for(int i=0;i<7;i++){
			total[i]=p1[i]+p2[i];
			System.out.println(total[i]);
		}
	}
}