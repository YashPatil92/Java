import java.util.Scanner;

class Matrix{
	public void printMatrix(int [][]m){
		System.out.println("\n The Given matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.printf("%4d",m[i][j]);
			}
			System.out.println();
		}
	}
	public void transpose(int [][]m){
		System.out.println("\n The transpose matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.printf("%4d",m[j][i]);
			}
			System.out.println();
		}
	}
	public void LeftDiagonal(int [][]m){
		System.out.println("\n The Left Diagonal elements of matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==j)
				System.out.printf("%4d",m[i][j]);
			}
			System.out.println();
		}
	}
	public void RightDiagonal(int [][]m){
		System.out.println("\n The Right Diagonal elements of matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i+j==2)
				System.out.printf("%4d",m[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
		int [][] m = new int [3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of 3x3 matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				m[i][j] = sc.nextInt();
			}
		}
		Matrix a = new Matrix();
		a.printMatrix(m);
		a.transpose(m);
		a.LeftDiagonal(m);
		a.RightDiagonal(m);
	}
}