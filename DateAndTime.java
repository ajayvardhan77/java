package hackerrank;
import java.time.*;
import java.util.*;
public class DateAndTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//enter date
		int dd = sc.nextInt();
		//enter month
		int mm = sc.nextInt();
		//enter year
		int yy = sc.nextInt();
		
		LocalDate dt = LocalDate.of(yy,mm,dd);
		System.out.println(dt.getDayOfWeek());
		
		

	}

}
