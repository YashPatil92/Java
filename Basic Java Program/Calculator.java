import java.util.Scanner;

class Calculator{
	int add(int a, int b){
		/*System.out.println("a= " +a);
		System.out.println("b= " +b);*/
	      //System.out.println("Addition:" + (a+b));
		return a+b;
	}

	int sub(int a, int b){
		/*System.out.println("a= " +a);
		System.out.println("b= " +b);*/
		return a-b;
	}
	
	int div(int a, int b){
		/*System.out.println("a= " +a);
		System.out.println("b= " +b);*/
		return a/b;
	}

	int mul(int a, int b){
		/*System.out.println("a= " +a);
		System.out.println("b= " +b);*/
		return a*b;
	}

	public static void main(String[]args){
		Calculator c1= new Calculator();
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number:");
		a=sc.nextInt();
		b=sc.nextInt();
			//System.out.println("Addition:" +c1.add(20,30));
			System.out.println("Addition:" +c1.add(a,b));
			System.out.println("Sub:" +c1.sub(a,b));
			System.out.println("Division:" +c1.div(a,b));
			System.out.println("multi:" +c1.mul(a,b));

	      /*int x = c1.add(45,87);
		System.out.print("Addition:" +x);*/
	}
}