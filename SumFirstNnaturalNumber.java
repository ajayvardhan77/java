package Recursion;

public class SumFirstNnaturalNumber {

	public static void main(String[] args) {
		System.out.println(sum(15));
		

	}

	static int sum(int n) {
		if(n==1) { //base condition
			return 1;
		}
		return n + sum(n - 1); // generalisation.
	}
}
