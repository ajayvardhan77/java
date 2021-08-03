package arrays;

public class ArraysIntro {

	public static void main(String[] args) {
		int [] marks = new int[5]; // array declearation.
		System.out.println(marks);//it prints the address 
		System.out.println(marks[2]);//inital values 
		System.out.println(marks[3]);
		
		// initialising an array
		System.out.println("initialisation of array with values");
		int[] mark = {10,20,30,50,60 };
		System.out.println(mark[2]);
		System.out.println(mark[4]);
		
		System.out.println("updating an array");
		
		mark[2] = 45;
		System.out.println(mark[2]);
		
		for(int i = 0 ; i < mark.length ; i++) { // mark.length : returns the length of the array 
			System.out.println(i +" "+ mark[i]);
		}

	}

}
