import java.util.LinkedList;

public class LinkedListExample{
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();

		animals.add("Dog");
		animals.add("Cat");
		animals.addFirst("Elephant");
		animals.addLast("Horse");

		System.out.println("First animal: " + animals.getFirst());
		System.out.println("Last animal: " + animals.getLast());
		
		System.out.println("Animals: " + animals);
		for (String animal : animals) {
			System.out.println(animals);
}
}
}