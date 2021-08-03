package strings;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
// JAVA program to reverse a string without using string method reverse()
	 Scanner sc = new Scanner(System.in);
	 System.out.println("ENTER str1:");
	 String str = sc.nextLine();
	 char[] s = str.toCharArray();
	 int n = s.length;
	 System.out.println("ORGINAL STR:\n"+ str );
	 System.out.println("REVER STRING:");
	 for(int i = n - 1;i >= 0 ; i--) {
		 System.out.print(s[i]);
		
	 }
	
		
		
		
	}

}
