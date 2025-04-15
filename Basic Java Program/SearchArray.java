import java.util.Scanner;

class SearchArray{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Eneter any 10 number");
		int i=0;
		int [] no = new int[10];
		for(i=0; i<10; i++){
			no[i]=sc.nextInt();
		}

		while(true){

		System.out.println("Enter the number to search");
		//generally to number search is called as key
		int key=sc.nextInt();
		//no
		//[12,22,33,44,55,66,77,88,99,10]
		//key
		//33
		for(i=0;i<10;i++){
			if(key==no[i]){
				System.out.println("The value is found at position: " + (i+1));
				break;
			}
		}
		if(i==10){
			System.out.println("Number is not found"); 
		}
		}
	}
}