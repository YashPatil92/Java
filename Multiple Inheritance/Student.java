
public class Student {
	int rollno;
	String Name;
	
	/*public void setdata(){
		rollno=55;
		Name="Yash";
		
	}*/
	public void setdata(int rollno, String Name) {
		this.rollno=rollno;
		this.Name=Name;
	}
	 public void showdata() {
		System.out.println("Roll no :" +rollno);
		System.out.println("Name is :" +Name);
	 }

}
