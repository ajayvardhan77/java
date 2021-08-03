package arrays;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
//		Take 20 integer inputs from user and print the following:
//		number of positive numbers
//		number of negative numbers
//		number of odd numbers
//		number of even numbers
//		number of 0s.
//	
		 Scanner s = new Scanner(System.in);
		    int[] z = new int[20];
		    int pos = 0;
		    int neg = 0;
		    int odd = 0;
		    int even = 0;
		    int zero = 0;
		    for(int i = 0;i<z.length;i++){
		      System.out.println("Print the value of z["+i+"]");
		      z[i] = s.nextInt();

		      if(z[i]>0){
		        pos++;
		      }
		      else if(z[i]<0){
		        neg++;
		      }
		      else{
		        zero++;
		      }
		      if(z[i]%2==0){
		        even++;
		      }
		      else{
		        odd++;
		      }
		    }
		    System.out.println("Positive : "+pos+"\nNegative : "+neg+"\nZero : "+zero+"\nodd : "+odd+"\neven : "+even+"");
		}
		


	}


