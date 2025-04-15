import java.util.Scanner;
class Armstrong{ 
	public void armstrong(int no){
  	//  no          d          sum 
	 //  0          1          153
  		int d,sum=0;  
		int org=no;
  		while(no>0){   
		d = no%10;
   		sum = sum + d*d*d;   
		no=no/10;
  	}  
	if(sum==org){
   		System.out.println("Armstrong");  
	}
  	else{   
		System.out.println("Not Armstrong");
  	} 
}
 	public static void main(String [] args){  
	//  153   1*1*1 + 5*5*5 + 3*3*3 = 153
  	Scanner sc = new Scanner(System.in);  
		System.out.println("Enter any number");
  		int no=sc.nextInt();  
		Armstrong a = new Armstrong();
  		a.armstrong(no); 
	}
}












/*	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int org=no;
		int d,sum=0;

		int no=sc.nextInt();
		while(no>0){
			d=no%10;
			sum=sum+ d*d*d;
			no=no/no;
		}
		if(sum==org){
			System.out.println("No is Armstrong");
		}
		else{
			System.out.println("No is Not Armstrong");
		}
	}
}
*/