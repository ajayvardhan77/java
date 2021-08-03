package strings;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
//This JAVA program is to convert a string from uppercase to lowercase without using string method.
/*HINT:
 *We iterate till the length of the string and check for small case characters.
 *If we find an uppercase character then we know that ASCII value of ‘A’ is 65 and that of ‘a’ is 97, 
 *so the difference between uppercase and lowercase is 32 so we add 32 to the uppercase character.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING YOU WANT TO CONVERT FROM UPPERCASE TO LOWER CASE:");
		String s = sc.nextLine();
		char[] str = s.toCharArray();
		System.out.println("LENGTH OF THE STRING :"+ " "+ str.length);
		for(int i = 0 ; i < str.length;i++) {
			if(str[i] >= 'A' && str[i] <= 'Z') {
				str[i] = (char) ((int)str[i] + 32);
			}
		}
		System.out.println();
		System.out.println("LOWER CASE : ");
		for(char string : str) {
			System.out.print(string);
		}
		
		

	}

}
