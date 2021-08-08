package hackerrank;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegx {
	public static boolean isvalidip(String ip) {
		
		
		if(ip == null || ip.isEmpty()) {
			return false;
		}
		
		String regx = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		String regexdigit = regx+"\\." + regx+"\\."+regx+"\\."+regx;
		Pattern p = Pattern.compile(regexdigit);
		Matcher m = p.matcher(ip);
		return m.matches();
		
		
				}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		sc.next();
		for(int i = 0 ; i < n ; i++) {
			str[i] = sc.nextLine();
		}
		for(int i = 0 ; i < n ; i++) {
			if(isvalidip(str[i]) == true) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		
	}

}
