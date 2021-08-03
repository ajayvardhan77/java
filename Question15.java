package strings;
import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
// JAVA program to concatenate two strings without using string method concat()

/*HINT:
 * In java it is quite easy to concatenate two strings.
 *We use ‘+’ operator in java for concatenation of two strings*/
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STR1:");
		String str1 = sc.nextLine();
		System.out.println("ENTER STR2: ");
		String str2 = sc.nextLine();
		
		System.out.println("STRING CONCENTATION: \n" + str1+str2);
	}

}
