import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");

		System.out.println("Fruits: " + fruits);
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		fruits.remove("Banana");
		System.out.println("After removal: " + fruits);	
}
}