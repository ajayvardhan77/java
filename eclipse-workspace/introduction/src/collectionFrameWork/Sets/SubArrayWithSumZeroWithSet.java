package collectionFrameWork.Sets;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZeroWithSet {

	public static void main(String[] args) {
		// NOW YOUR TIME COMPLEXITY IS REDUCED TO O of N & COMES SPACE.
		int sum = 0 ;
		boolean found = false;
		int[] a = {2,1,-3,4,2,-3};
		Set<Integer> set = new HashSet<Integer>();
		for(int element : a) {
			set.add(sum);
			sum+= element;
			if(set.contains(sum)) {
				found = true;
				break;
			}
			
		}
		System.out.println("found: " + found);
		
		

	}

}
