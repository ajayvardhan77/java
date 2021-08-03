package strings;
import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
//This JAVA program is to compare two strings using string method equals(String).
/*HINT:
 * Return boolean values str1.equals(str2)

True if both strings have same content.
False if both strings have different content*/

/*NOTE:
 *When we compare strings in java do not use “==” operator as it compares the reference to the objects 
 *and not the content of the strings.*/	
		Scanner sc =  new Scanner(System.in);
		System.out.println("ENTER str1");
		String str1 = sc.nextLine();
		System.out.println("ENTER str2");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("BOTH THE STRINGS ARE EQUAL...!");
			System.out.println(str1+" = "+str2+"("+(str1.equals(str2))+")");
		}
		else {
			System.out.println("BOTH THE STRINGS ARE NOT EQUAL");
			System.out.println(str1+ " !=  "+ str2 +"("+str1.equals(str2)+")");
		}

	}

}
