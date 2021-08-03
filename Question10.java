package strings;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
//This JAVA program is to compare two strings without using string method equals().
		
/*HINT:
 * We first check if both their lengths are equal. 
 *If strings are not equal, we need not go further with computation,
 *thus increasing the efficiency of the program. 
 *If they are equal then we compare each string character by character.*/
		
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		System.out.println("ENTER TEXT1:");
		String s = sc.nextLine();
		System.out.println("ENTER TEXT2:");
		String s1 = sc.nextLine();
		char[] str =  s.toCharArray();
		char[] str1 = s1.toCharArray();
		int n = str.length;
		int n1 = str1.length;
		if(n == n1) {
			for(int i = 0 ; i < n ; i++) {
				if(str[i] != str1[i]) {
					flag = 1;
					break;
				}
			}
		}else {
			flag = 1;
		}
		
		if(flag ==0) {
				System.out.println("TEXT1 AND TEXT2 ARE EQUAl...!");
				System.out.println(s+" " + "==" +" "+s1 );
				
				
			}else {
				System.out.println("TEXT1 IS NOT EQUAL TO TEXT2");
				System.out.println(s +" "+ "!= "+" "+s1);
			
		}
		
		
		
				
		
		
		
	}

}
