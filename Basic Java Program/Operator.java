class Operator{
	public static void main(String[] args){
		int a=5;
		int b=8;
		//++a prefix --increment first and then use
		//a-- postfix --use first and then increment

		// a  b  c
		//6  7   14

		int c=++a + b--;
		// c=6+8
		System.out.println(a+ " "+b+" "+c);
}
}