package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		// a) Declare An array for {3,2,11,4,6,7};	 
		
		int[] arr1 = {3,2,11,4,6,7};
		
		// b) Declare another array for {1,2,8,4,9,7};
		
		int[] arr2 = {1,2,8,4,9,7};
		
	//	c) Declare for loop iterator from 0 to array length for first Array
		
		for (int i = 0; i < arr1.length; i++) {
			
			
			//  d) Declare a nested for another array from 0 to array length for second Array
			 
			for (int j = 0; j < arr2.length; j++) {
				
				// e) Compare Both the arrays using a condition statement
				
				if (arr1[i]==arr2[j]) {
					
					// f) Print the first array (shoud match item in both arrays)
					
					System.out.println(arr2[j]);
					
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		 int []x = {3,2,11,4,6,7};
//		 int []y = {1,2,8,4,9,7};
//		 for(int i=0;i<n;i++) {
//			 for(int j=0;j<m;j++) {
//				 if (x[i]==y[j]) {
//					 
//				 }
			 }
}