package collectionFrameWork.Sets;

public class SubarrayWithSumZeroWithForLoop {

	public static void main(String[] args) {
		//TIME COMPLEXITY IS : O OF N2
		int sum = 0 ; 
		boolean found = false;
		int[] a = {2,1,-3,4,2,-2};
		for(int i = 0 ; i < a.length ; i++) {
			for(int j= i ; j < a.length ; j++) {
				sum+= a[j];
				if(sum == 0) {
					found = true;
					break;
					
				}
				if(found) break;
			}
			
		}
		System.out.println("found : " + found);
	}

}
