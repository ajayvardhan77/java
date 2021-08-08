package hackerrank;

import java.io.*;
import java.util.*;

public class CheckReverseString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer sb = new StringBuffer(A);
        if(A.equals(sb.reverse().toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
       // System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    }
}



