
public class StringDemo {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Hello");
		s1.append("Java");
		s1.delete(1,4);
		s1.reverse();
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("Good Afternoon");
		s2.reverse();
		System.out.println(s2);

	}

}
