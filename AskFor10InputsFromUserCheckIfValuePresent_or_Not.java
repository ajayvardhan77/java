package arrays;
import java.util.Scanner;

import java.util.Scanner;

public class AskFor10InputsFromUserCheckIfValuePresent_or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("enter the number");
			a[i] = sc.nextInt();
		}
		System.out.println("enter the number to check whether number is present in array or not ");
		int b = sc.nextInt();
		boolean number = false;
		for(int i = 0 ; i < a.length ; i++) {
			if(b == a[i]) 
				number = true;
			else {
				number = false;
			}
		}
		System.out.println(number);

	}

}
