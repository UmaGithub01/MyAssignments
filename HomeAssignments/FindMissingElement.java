package week1.HomeAssignments;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		//Input Array
		int a[]={1, 4,3,2,8, 6, 7}; 
		Arrays.sort(a);
		int b=0; //variable to pass as array index to fetch each value from array
		
		for (int i = 0; i <= a.length; i++) {
			//check if the iterator value is not equal to array value
			if (a[b]!=i+1) {
				System.out.println(i+1); //print missing element
				i++; 
				
			}
			b++;
			
		}
	}

}
