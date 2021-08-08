package hackerrank;
import java.util.*;
public class StringIntroductions {

	public static void main(String[] args) {
/*Given two strings of lowercase English letters,  and , perform the following operations:

1.Sum the lengths of A and B.
2.Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
3.Capitalize the first letter in A and B and print them on a single line, separated by a space.*/
		Scanner sc = new Scanner(System.in);
		int flag =0;
		String A = sc.nextLine();
		String B = sc.nextLine();
		char[]a1 = A.toCharArray();
		char[]b1 =  B.toCharArray();
		int a = A.length();
		int b = B.length();
		System.out.println(a + b);
		if(a != b) 
			System.out.println("NO");
			
		if(a == b) {
			for(int i = 0 ; i < A.length();i++) {
				if(a1[i] == b1[i]) {
					flag =1;
					break;
				}else {
					flag = 0;
					break;
				}
		
			}
			if(flag == 1) {
				System.out.println("yes");
			}else {
				System.out.println("NO");
			}
		}
		
		String cap = A.substring(0, 1).toUpperCase() + A.substring(1);
		String cap1 = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(cap +" "+cap1);
		
		
		
	}

}
