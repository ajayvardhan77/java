package Recursion;

public class APowerB {
	 static int stepcount = 0;

	public static void main(String[] args) {
	
		System.out.println(Pow(2,10));
		System.out.println("step:" + stepcount);
		

	}
	static int Pow(int a , int b) {
		stepcount++;
		if(b ==0) {
			return 1;
		}
		return a * Pow(a , b-1);
	}

}
