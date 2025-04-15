import java.util.Scanner;

class EvenOdd2{ 
	public void evenodd(int no){
 		if(no%2==0){   
			System.out.println("Even");
  		}
		else{
			System.out.println("Odd");  
		}
 	} 
		public static void main(String [] args){
 		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter any number");
  		int no = sc.nextInt();  	
		EvenOdd2 e1 = new EvenOdd2();
  		e1.evenodd(no);
	}
}

