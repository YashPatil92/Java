import java.util.Scanner;

class Tour2{
	public static void main(String [] args){  int no;
  		System.out.println("Please enter any number from below options");  
		System.out.println("1. USA tour");
  		System.out.println("2. UK tour");  
		System.out.println("3. Switzerland ");
  		System.out.println("4. Bali ");  
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();  // else if ladder 
  		if(no==1){   System.out.println("8 Days 7 Nights , Naigara waterfall, national park, Statue of liberty");
  		}  
		else if(no==2){
   		System.out.println("8 Days 7 Nights , British musium, Power bridge");  
		}
  		else if(no==3){   
		System.out.println("8 Days 7 Nights , Bern, Geneva, Lugano");
  		}  
		else  if(no==4){
   		System.out.println("8 Days 7 Nights , Tanah , Monkey forest, Bali safari "); 
}   
}
}
