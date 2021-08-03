package strings;
import java.util.Scanner;
public class Question14 {

	public static void main(String[] args) {
// JAVA program to reverse a string using reverse() method.

/*HINT:
 * As strings are immutable in JAVA we have to either 
 * use StringBuilder or the StringBuffer class 
 *in java to implement this method.*/		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STR:");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		System.out.println("REVER STRING(USING StringBuffer): \n" + sb.reverse());
		StringBuilder sbr = new StringBuilder(str);
		System.out.println("REVER STRING (USING StringBuilder): \n" + sbr.reverse());
		
		
		
		
		

	}

}
