import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
	
		map.put("Yash", 22);
		map.put("Darshan", 21);
		map.put("Rutu", 20);

		System.out.println("Yash's age: " + map.get("Yash"));
		
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		map.remove("Darshan");
		System.out.println("After removal: " + map);
}
}