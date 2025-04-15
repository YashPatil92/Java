import java.util.Scanner;

class DoWhileDemo{
	public static void main(String[] args){
		int no;
		int opt;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1.Square");
			System.out.println("2.Cube");
			System.out.println("3.EvenOdd");
			System.out.println("4.PositiveNegative");
			System.out.println("5.Exit");


			System.out.println("Please enter your option");
			 opt = sc.nextInt();

			if(opt==5){
				System.out.println("Exit");
				break;


			}
			System.out.println("Give your no");
			no=sc.nextInt();
			if(opt==1){
				//System.out.println("Give me a number");
				//no=sc.nextInt();
				System.out.println("Square = "+no*no);
			}
			else if(opt==2){
				//System.out.println("Give me a number");
				//no=sc.nextInt();
				System.out.println("Square = "+no*no*no);			
			}
			else if(opt==3){
				if(no%2==0){
				System.out.println("Even");
				}
				else{
				System.out.println("odd");
				}
			}
			else if(opt==4){
				if(no>0){
					System.out.println("Positive");
				}
				else{
					System.out.println("Negative");
				}
			}
		

		}while(opt!=5 );
	}
}