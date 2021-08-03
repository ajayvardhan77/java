package arrays;
import java.util.Scanner;
public class Take10InputsFromUserStoreThemInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("enter the number");
			a[i] = sc.nextInt();
		}
		System.out.println();
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(i+"." + " "+ a[i]);
		}
		

	}

}
