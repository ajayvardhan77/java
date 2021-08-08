package hackerrank;
import java.util.*;
public class SubStringComparsion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("value of k");
		int k  = sc.nextInt();
		System.out.println("length of the string :"+ str.length());
		for(int i = 0 ; i < str.length() ; i++) {
			for(int j = i   ; j < str.length() - 1  ; j++) {
				arr.add(str.substring(i , j+2));
				break;
			}
		}
		//conertion of arraylist to array.
		 String[] a = new String[arr.size()]; // array size.
	        a = arr.toArray(a);
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = i + 1 ;  j < a.length ; j++) {
				if(a[i].compareTo(a[j])> 0) {
					 String temp = a[i];  
		              a[i] = a[j];  
		               a[j] = temp;  
					
				}
			}
		}//sorted array.
		
	   System.out.print(a[0] + "\n" + a[a.length - 1]);
		
		
		
				
				
			
		
		

	}

}
