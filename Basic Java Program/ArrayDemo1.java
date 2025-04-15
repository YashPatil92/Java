import java.util.Scanner;

class ArrayDemo1{
	public static void main(String[] args){
		//datatype [] arratname = new datatype[size];
		int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 numbers");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("The array elements are : \n");
		for(int i=0;i<10;i++){
			System.out.println(a[i]);
		}
		System.out.println("The array elements in reverse are : \n");
		for(int i=9;i>=0;i--){
			System.out.println(a[i]);
		}
	}

}