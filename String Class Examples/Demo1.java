

public class Demo1 {

	public static void main(String[] args) {
		int n=8; //integer literal
		String s1="Aello"; //String literal
		String s2= new String("Java"); //String object
		
		//stack memory               Heap Memory
		//reference                  object
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.length());
		System.out.println(s1.concat("Java"));
		System.out.println(s1.endsWith("Aello"));
		System.out.println(s1.equals("Aello"));
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.repeat(6));
		System.out.println(s1.replace("ll","yy"));
		System.out.println(s1.substring(2));
		System.out.println(s1.toUpperCase());
	}

}
