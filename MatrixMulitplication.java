package arrays;
import java.util.Scanner;

public class MatrixMulitplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter dimention of a matrix");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		int [][] a = new int[row1][col1];
		System.out.println("enter dimentions of b matrix");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		int [][] b = new int[row2][col2];
		System.out.println("enter matrix a");
		for(int i = 0 ; i < row1 ; i++) {
			for(int j = 0 ; j < col1 ; j++) {
				
				a [i][j] = sc.nextInt();
				 }
		}
		System.out.println("enter matrix b");
		for(int i = 0 ; i < row2 ; i++) {
			for(int j = 0 ; j < col2 ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		if(a.length == b.length ) {
			int [] [] c = new int [row1][col1];
			for(int i = 0 ; i < row1 ; i++) {
				for(int j = 0 ; j < col2 ; j++) {
					c[row1][col1] = a[row1][col2]*b[row2][col2];
					
				}
				System.out.println(c[row1][col2]);
			}
			
		}else {
			System.out.println("multiplication is not possible");
		}
	}

	}


