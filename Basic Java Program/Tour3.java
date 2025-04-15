import java.util.Scanner;

class Tour3{
	public static void main(String [] args){  
		int no;
  		System.out.println("Please enter any number from below options");  
		System.out.println("1. USA tour");
  		System.out.println("2. UK tour");  
		System.out.println("3. Switzerland ");
  		System.out.println("4. Bali ");  
		Scanner sc = new Scanner(System.in);
  		no = sc.nextInt();  
		switch(no){
  		case 1:    
		System.out.println("8 Days 7 Nights , Naigara waterfall, national park, Statue of liberty");
    		break;     
		case 2:
    		System.out.println("8 Days 7 Nights , British musium, Power bridge");    
		break;
   		case 3:    
		System.out.println("8 Days 7 Nights , Bern, Geneva, Lugano");
    		break;   	
		case 4:
    		System.out.println("8 Days 7 Nights , Tanah , Monkey forest, Bali safari ");    
		break;
   		default:   
		System.out.println(" Invalid option");
    		break;   
}
}
}