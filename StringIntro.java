package strings;

public class StringIntro {

	public static void main(String[] args) {
		String name = "ajay vardhan";// it is stored in string pool area.
		String name1 = "ajay vardhan" ;// it is stored in string pool area.
		String name2 = new String("ajay vardhan"); // it is stored in heap area.
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		/*returns true becaz, both are stored in string pool area,
		 *name variable holds the string "ajay vardhan" in heap area ,
		 *whn you assign another variable called name1 to the same string called "ajay vardhan"
		 *string pool area won't let us create another value of same one instead of it use already existed value, 
		 *so it returns true*/
		System.out.println(name == name1);
		/*name  or name1 is not samw as name2 becaz both name or name1 variables are stored in string pool area,
		 *  where as name2 is stored in heap area */
		System.out.println(name == name2);
		System.out.println(name1 == name2);
		   
		
		                       /*strings functions*/
		System.out.println();
		String name3 = "ajay vardhan";
        String name4 = "alexa";
		System.out.println(name3);
		System.out.println( "1." +" "+ name3.length());
		System.out.println("2."+" "+name3.charAt(3)); // returns u the cahara or text present at specific index.
		System.out.println("3."+" "+name3.substring(5));
		System.out.println("4."+" "+name3.substring(5, 9));
		System.out.println("5."+" "+name3.contains(name4));//returns true if specified sequence of cahra is present.
		System.out.println("6."+" "+name3.equals(name4));// checks with the values not the string references
	    System.out.println("7."+" "+name3.isEmpty()); // returns true if string is empty
	    System.out.println("8."+" "+name3.concat(name4)); // combines the strings
	    System.out.println("9."+" "+name3.replace('a', 'X'));
	    System.out.println("10."+" "+name3.toLowerCase());
	    System.out.println("11."+" "+name3.toUpperCase());
	    System.out.println("12."+" "+name3.trim());
	    System.out.println("13."+" "+name3.indexOf('v'));
	    String foods = "maggi , biriyani , pizza , icecream,bonda";
	    String allfoods[] = foods.split(",");
	    for(int i = 0 ;  i < allfoods.length ;i ++) {
	    	System.out.print(" "+ allfoods[i]);
	    }
	  
		
		
	}

}
