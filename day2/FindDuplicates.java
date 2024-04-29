package week1.day2;


public class FindDuplicates {
	public static void main(String[] args) {
		//Input Array
		int[] nums= {2,5,7,7,5,9,2,3,2};
		int len=nums.length; //Length of the Array
		
		//Nested loops to find the duplicates
		for (int i = 0; i < len; i++) {
			
			for (int j = i+1; j < len; j++) {
				if (nums[i]==nums[j]) {
					System.out.println(nums[i]);
					break;
					
				}
			}
			
		}
	}

}
