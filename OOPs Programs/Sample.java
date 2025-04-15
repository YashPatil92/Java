/*
public class StaticSample {
	int no;
	String name;
	
	static String city;
	
	//static block
	static {
		//static block gets executed before main method
		System.out.println("I am inside static method");
		city="puen";
	}
	
	public void m1() {
		
	}
	//static method
	static public void m2() {
		city="pune";
		System.out.println("I"
				+ ""
				+ " am inside static method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("I am in side main method");
		StaticSample a =new StaticSample();
		a.m1();

		StaticSample.m2();
	}
}
*/
public class Sample {
	int no;
	String name;
	static String city;
	
	static {
		//static block gets execute before main method
		System.out.println(" I am inside static block");
		city = "pune";
	}
	
	//instance method
	public void m1() {
		System.out.println(" I am inside m1 method ");
	}
	//static method
	static public void m2() {
		//static methods can access only static fields
		city = "pune";
		System.out.println(" I am inside static method");
	}
	
	public static void main(String[] args) {
		System.out.println(" I am inside main method ");
		// static methods can be called without creating instance of the class
		Sample.m2();
		
		// instance methods are called only with the help of any instance of the class
		Sample s1 = new Sample();
		s1.m1();
		
		System.out.println(Math.PI);
		System.out.println((int)Math.random()*100);
		
		
	}
}