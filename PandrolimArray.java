package arrays;
import java.util.Scanner;
public class PandrolimArray {

	public static void main(String[] args) {
		/*1.initiliase flag to unset in flag = 0
		 * 2.loop the array till size n/2
		 * 3.in a loop check if a[i] = a[n-i-1] then set the flag = 1 and break
		 * 4.after the loop has ended ,if flag is set then print not a palindrom else print paloinddrom. */
		/*reason:
		 * loop the array till n/2 : becaz we need to check first and last element at ones so it iterates till n/2
		 * eg: if the array as 5 elements the iterate the loop over the 2 times*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("enter the element of the arrray a["+i+"]");
			
			a[i] = sc.nextInt();
		}
		int flag = 0;
		for(int i = 0 ; i <= n/2 && n !=0 ; i++) {
			//check if first and last element of the array are different
			//set the flag and come out of loop
			if(a[i] != a[n-i-1]) {
				flag = 1;
				break;
			}
		}
		if(flag ==1) {
			System.out.println("NOT PALINDROM");
		}else {
			System.out.println("PALINDROM");
		}
		
		
		

	}

}
