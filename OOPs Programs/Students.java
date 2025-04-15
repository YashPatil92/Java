
public class Students {
	//Instance and Static Variables
	//Instance and Static Methods
	//Static Keyword
	//Method Calling Mechanism
	int roll;
	String name;
	
	static String schoolname;
	
	public void show(int roll, String name) {
		System.out.println("roll :" + roll);
		System.out.println("name :" + name);
	}
	
	static public void test(String schoolname) {
		System.out.println("schooLname :" +schoolname);

	}
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.show(10,"Yash");
		Students.test("Grace Academy");
	}
}
