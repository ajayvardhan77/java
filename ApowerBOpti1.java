package Recursion;

public class ApowerBOpti1 {

	static int stepcount = 0 ;
	public static void main(String[] args) {
		
		/*steps taken to complete is less */
		System.out.println(fastpow(2,10));
		System.out.println("stepcoun :"+ stepcount);
		
		

	}
	static int fastpow(int a , int b) {
		stepcount++;
		System.out.println("b :"+ b);
		if(b == 0 ) {
			return 1;
		}
		if(b % 2 == 0 ) {
			return fastpow(a*a,b/2);
		}
		return a * fastpow(a,b - 1);
	}

}
