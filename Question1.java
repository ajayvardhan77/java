package strings;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
// This JAVA program is to convert a string from lowercase to uppercase without using string method
/*HINT:
 *We iterate till the length of the string and check for small case characters.
 *If we find a small case character then we know that ASCII value of ‘a’ is 97 and that of ‘A’ is 65,
 *so the difference between uppercase and lowercase is 32 so we subtract 32 from the lowercase character.*/
	Scanner sc = new Scanner(System.in);
	System.out.println(("ENTER THE STRING YOU WANT TO CONVERT FROM LOWER CASETO UPPER CASE"));
	String st = sc.nextLine();
	char[] str = st.toCharArray();
	System.out.println("LENGTH OF THE STRING : "+" "+ str.length);
	for(int i = 0 ; i < str.length;i++) {
		if(str[i] >=  'a' && str[i] <= 'z') {
			str[i] = (char)(str[i] - 32);
			
		}
	}
		for(int i = 0 ; i < str.length ; i++) {
			System.out.print(str[i]);
		}
	}

	}


