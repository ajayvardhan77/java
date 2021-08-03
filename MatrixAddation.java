package arrays;
import java.util.Scanner;
public class MatrixAddation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter dimention");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int [][] a = new int[rows] [cols];
		int [][] b = new int[rows][cols];
		
		System.out.println("enter matrix a");
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j < cols ; j++) {
				a[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("enter matrix b");
		for(int i = 0 ; i < rows ; i ++) {
			for(int j = 0 ; j < cols ; j++) {
				b[i][j] = sc.nextInt();
				
			}
		}
		
		int [][] c = new int[rows][cols];
		for(int i = 0 ; i < rows ; i ++) {
			for(int j = 0 ; j < cols ; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("resultant array c :");
		for(int i = 0 ; i < rows ; i ++) {
			for(int j = 0 ; j < cols  ; j++ ) {
				System.out.println(c[i][j]);
			}
		}
		

	}

}
