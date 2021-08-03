package strings;
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
//JAVA program to check if the string is a palindrome
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		System.out.println("ENTER THE TEXT TO CHECK WHTHER IT IS PALINDROM OR NOT ?");
		String str = sc.nextLine();
		char[] s = str.toCharArray();
		int n = s.length;
		
		for(int i = 0 ; i < n ; i++) {
			if(s[i] != s[n - i - 1]) {
				flag = 1;
			}
		}
		if(flag == 0) {
			System.out.println("ITS PALINDROM");
		}else {
			System.out.println("NOT A PALINDROM.");
		}
				
				
			
	}

}
