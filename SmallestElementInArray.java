package arrays;
import java.util.Scanner;
public class SmallestElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = sc.nextInt();
		}
		int smallest = a[0]; // assumation we made.
		for(int i = 0 ; i < a.length ; i++) {
			if (smallest > a[i] ) 
				smallest = a[i];
		}
		System.out.println("smallest element in array is "+smallest+"");
	
	}

}
