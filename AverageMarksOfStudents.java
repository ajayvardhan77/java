package arrays;
import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of students");
		int n = sc.nextInt();
		int[] marks = new int[n];
		
		for (int i = 0 ; i < marks.length ; i++) {
			System.out.println("enter student marks");
			marks[i] = sc.nextInt();
		}
		// average marks
		int avg_marks = 0;
		for(int i = 0 ; i < marks.length ; i++) {
			avg_marks = avg_marks + marks[i];
			
			}
		System.out.println("total sum :"+ avg_marks);
		avg_marks = avg_marks / n;
		System.out.println("avg marks of all the students :" + avg_marks);
		

	}

}
