package hackerrank;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
public class Currency_Formatter {

	public static void main(String[] args)   {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter the currency:");
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	       

	        /* Create custom Locale for India. 
	          I used the "IANA Language Subtag Registry" to find India's country code */
	        Locale indiaLocale = new Locale("en", "IN");

	        /* Create NumberFormats using Locales */
	        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
	        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
	        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        NumberFormat canada = NumberFormat.getCurrencyInstance(Locale.CANADA);
	        NumberFormat german = NumberFormat.getCurrencyInstance(Locale.GERMAN);
	        /* Print output */        
	        System.out.println("US: "     + us.format(payment));
	        System.out.println("India: "  + india.format(payment));
	        System.out.println("China: "  + china.format(payment));
	        System.out.println("France: " + france.format(payment));
	        System.out.println("canada: "+ canada.format(payment));
	        System.out.println("german: "+ german.format(payment));
	        
	 
 
	        
	        
	       
	}

}
