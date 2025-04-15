
public class Student {
		int roll;
		String name;
		int marks;
		
	public void setData() {
		roll=10;
		name="Yash";
		marks=98;
	}

	public void printData() {
		System.out.println("Roll no :" +roll);
		System.out.println("Name is :" +name);
		System.out.println("Marks :" +marks);
	}
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.setData();
		s1.printData();
		
	}
}
