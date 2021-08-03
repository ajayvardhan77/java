package strings;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
//This JAVA program is to compare two strings using string method equalsIgnoreCase(String).
/*HINT:
 * 1.String method equalsIgnoreCase() compares the two strings.
2.This method is similar to the equals() method with only difference is that equalsIgnoreCase()
 method is not case sensitive, 
that is if we have two strings let’s say s1 = ‘code’ and s2 = ‘CODE’,
this method will yet return true as it ignores 
the case(whether the character is lowercase or upper case).*/
   
		
/*HINT:
 * Return boolean values str1.equalsIgnoreCase(str2)

True if both strings have same content.
False if both strings have different content (ignores whether character is uppercase or lowercase)*/
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("ENTER str1");
		String str1 = sc.nextLine();
		System.out.println("ENTER str2");
		String str2 = sc.nextLine();
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("BOTH THE STRINGS ARE EQUAL...!");
			System.out.println(str1+" = "+str2+"("+str1.equalsIgnoreCase(str2)+")");
		}
		else {
			System.out.println("BOTH THE STRINGS ARE NOT EQUAL");
			System.out.println(str1+ " !=  "+ str2 +"("+str1.equalsIgnoreCase(str2)+")");
		}
		

	}

}
