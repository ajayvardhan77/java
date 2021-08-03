package arrays;
import java.util.Scanner ;

public class Question5 {

	public static void main(String[] args) {
//		Take 10 integer inputs from user and store them in an array. 
//		Now, copy all the elements in an another array but in reverse order.
		
	Scanner sc = new Scanner(System.in);
	int[] a = new int[10];
	int[] b = new int[10];
	
	for(int i= 0 ; i < a.length ; i++) {
		System.out.println("enter nuymber a["+i+"]");
		a[i] = sc.nextInt();
	}
	int j= 0;
	for(int i = b.length - 1 ; i >= 0 ; i-- ) { //b.length - 1 : becaz even though array size is n,but the length of it is n-1 , becaz indexing of array starts from 0.
		b[i] = a[j];
		j++;
		}
	//b now contains reverse order of a, to print them we r using for loop
	for(int i = 0; i < b.length ; i++) { 
		System.out.println("order of be b["+i+"] :\n"+b[i]);
	}
		
	
	
	
	
	
	
	
	}
	
		

	

}
