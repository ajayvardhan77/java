package arrays;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
//		Find largest and smallest elements of an array.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("enter value of a["+i+"]");
			a[i] = sc.nextInt();}
		int largest = a[0];
		int smallest = a[0];
		for (int i = 0 ; i < a.length; i++) {
			
			if(a[i] > largest) 
				largest = a[i];
			
			if(a[i]<smallest)
				smallest = a[i];
		}
		System.out.println("max number: "+largest+"\nmini number:"+smallest+"");
		
		
	}

}
