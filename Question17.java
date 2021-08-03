package strings;
import java.util.Scanner;
public class Question17 {

	public static void main(String[] args) {
/*JAVA program to count the number of vowels, consonants, digits, white spaces &
 *  special characters in a given string
 */
 
		Scanner sc = new Scanner(System.in);
		int vowels = 0 ;
		int consonants = 0 ;
		int numbers = 0 ;
		int spaces = 0;
		int specialcharacter = 0 ;
		System.out.println("ENTER STRING:");
		String str = sc.nextLine();
		char[] s = str.toCharArray();
		int n = s.length;
		System.out.println("LENGTH OF THE STRING :" + n);
		for(int i = 0 ; i < n ; i++) {
			if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
				vowels++;
			}
			else if(s[i] == 'A' || s[i] == 'E' ||s[i] == 'I' || s[i] == 'O' || s[i] == 'U' ) {
				vowels++;
			}
			else if((s[i] >=  'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z') ){
				consonants ++;
			}
			else if(s[i]>= '0' && s[i] <= '9') {
				numbers++;
			}
			else if(s[i] == ' ') {
				spaces++;
			}
			else {
				specialcharacter++;
			}
			
		}
		System.out.println("vowels: "+vowels+" \n" + "conssonants : "+consonants+"\n" + "numbers : "+numbers+" \n" + "spaces: "+spaces+"\n" +"special characters : "+specialcharacter+"");
		
		
		
		
	}

}
