
public class TestNotebook {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		Notebook b2 = new Notebook(100,50.50f,"classmate","A4");
		System.out.println(notebook);
		System.out.println(b2);
		//when we print object===classname 
		//but if we define a tostring() method then
		//that method will get called automaically
	}
	
}

