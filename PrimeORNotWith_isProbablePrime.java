package hackerrank;
import java.math.BigInteger;
import java.util.*;
public class PrimeORNotWith_isProbablePrime {

	public static void main(String[] args) {
/*isProbablePrime(int certainty):
 *The java.math.BigInteger.isProbablePrime(int certainty)
 *returns true if this BigInteger is probably prime,
 *false if it's definitely composite. If certainty is ≤ 0, true is returned.
 *
 *certainty : 1 --> checks for prime or not,if prime true else false
 *certainty : 0 or -1 ---> returns always true
 * */
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		boolean result = n.isProbablePrime(1);
		if(result) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}
		
		

	}

}
