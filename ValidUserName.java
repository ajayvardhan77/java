package hackerrank;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidUserName {
	
	public static boolean isvalidusername(String userName) {
		if(userName == null || userName.isEmpty()) {
			return false;
		}
		String regex = "^[A-Za-z]\\w{7,29}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(userName);
		return m.matches();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of employees:");
		int n = sc.nextInt();
		while(n-- !=0) {
			sc.next();
			String user = sc.nextLine();
			if(isvalidusername(user)) {
				System.out.println("valid");
				
			}else {
				System.out.println("invalid");
			}
		}
		
	}

}
