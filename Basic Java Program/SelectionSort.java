import java.util.Scanner;

class SelectionSort{
	public void sort(int[]a){
		int temp;
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public void print(int[]a){
		System.out.println("The array elements are : \n");
		for(int i=0;i<10;i++){
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String []args){
		int [] a =new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 numbers");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		
		SelectionSort b1 = new SelectionSort();
		b1.sort(a);
		b1.print(a); 
	}
}
