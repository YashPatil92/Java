import java.util.Scanner;

class IfDemo{
	public static void main(String [] args){
		int amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you have");
		amt = sc.nextInt();
		if(amt>100)
			System.out.println("You can purchase CocaCola, Pestry, Kurkure and Ice Cream");
}
}