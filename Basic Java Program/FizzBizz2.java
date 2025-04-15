import java.util.Scanner;
class FizzBizz2{
	public void FizzBizz(int s){
		for(int i=1;i<=100;i++){
			
		if(i%3==0 && i%5==0){
		System.out.print("FizzBizz");
		}

			if(i%3==0){
			
			System.out.print("Fizz");
			}
			else if(i%5==0){
			System.out.print("Bizz");			
			}
			
				System.out.print(i + " ");
		}		
	
			
}
		public void sort(int[]a){
		int temp;
		for(int i=0;i<10;i++){
			for(int j=0;j<9-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public void print(int[]a){
		System.out.println("The array elements are : \n");
		for(int i=0;i<10;i++){
			System.out.println(a[i] + " ");
		}
	}
	public static void main(String []args){
		int [] a =new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 numbers");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
			}
	
			int s=0;
		FizzBizz2 b1=new FizzBizz2();
			  b1.FizzBizz(s);
			  b1.print(a);
		          b1.sort(a);
		          b1.print(a);
		}
}
		