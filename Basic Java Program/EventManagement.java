import java.util.Scanner;

class EventManagement{ 
	public static void main(String [] args){
  		Scanner sc = new Scanner(System.in);  
		System.out.println("We are having following packages for your event");
  		System.out.println("Gold");  
		System.out.println("Silver");
  		System.out.println("Normal");
  		System.out.println("Please select your package");
  		String p = sc.next();  
  		switch(p){   
		case "Gold": System.out.println("You have selected Gold package"); 
        	System.out.println("In this package you will get Food, Decoration and Video shoot");         
		break;
   		case "Silver":System.out.println("You have selected Silver package");          	
		System.out.println("In this package you will get Food and Video shoot");
        	break;   
		case "Normal":System.out.println("You have selected normal package"); 
        	System.out.println("In this package you will get Food");         
		break;
  }   
}
}