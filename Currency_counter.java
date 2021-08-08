package hackerrank;
import java.util.*;
import java.math.*;
public class Currency_counter {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter amout you want to convert.");
			double amount = sc.nextDouble();
			System.out.println("enter the country you want to want your currency");
			sc.next();
			String currency = sc.nextLine();
			
			
			switch(currency) {
			case "USA":
				System.out.println(amount/74.1049);
				break;
			case "EUR":
				System.out.println(amount/87.7450);
				break;
			case "GBP":
				System.out.println(amount/103.231);
				break;
			case "AUD":
				System.out.println(amount/54.8966);
				break;
			case "SGD":
				System.out.println(amount/54.8604);
				break;
			case "CHF":
				System.out.println(amount/81.7536);
				break;
			case "JPY":
				System.out.println(amount/0.675488);
				break;
			case "CNY":
				System.out.println(amount/11.4677);
				break;
			case "NZD":
				System.out.println(amount/54.3214);
				break;
			case "PKR":
			System.out.println(amount/0.452110);
			break;
			default:
			System.out.println("sorry fot inconvenicanes,other countries currency is not yet uploaded.");
				break;		
			}
			
			
			

	}

}
