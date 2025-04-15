
public class MyCalculator {
	//Method Overloading
	public void add(int a,int b) {
		System.out.println("Addition of two ints"+ (a+b));
	}
	
	public void add(float a,float b) {
		System.out.println("Addition of two floars"+ (a+b));
	}
	public static void main(String[] args) {
		MyCalculator m1 = new MyCalculator();
		m1.add(4, 5);
		m1.add(4.5f,4.5f);

	}

}
