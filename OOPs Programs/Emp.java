
public class Emp {
	//Class and Object
	//Instance Variables
	//Instance Methods
	//Encapsulation
	//Method Calling using Object
	int E_id;
	String E_Name;
	int Salary;
	
	public void setData() {
		E_id=200;
		E_Name="Yash Patil";
		Salary=60000;
	}
	
	public void printData() {
		System.out.println("E_id is:" +E_id);
		System.out.println("Name is:" +E_Name);
		System.out.println("Employe Salary is:" +Salary);
	}
	
	
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setData();
		e1.printData();
	}
}
