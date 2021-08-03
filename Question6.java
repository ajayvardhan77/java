package arrays;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
//		Write a program to find the sum and product of all elements of an array.
		
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter size of the array:");
	   int n = sc.nextInt();
	   int[] a = new int[n];
	   int sum = 0;
	   int product = 1;
	   for(int i = 0 ; i < a.length ; i++) {
		   System.out.println("enter a number a["+i+"]");
		    a[i] = sc.nextInt();
		    sum += a[i];
		    product*=a[i];
		    }
	   System.out.println("sum:"+sum+"\nproduct: "+product+"" );
		
		
	}

}
