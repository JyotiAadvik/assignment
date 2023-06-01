package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		// index start with 0
		
		
		Arrays.sort(arr);
		
		int length = arr.length;

		System.out.println("Length of Array: "+ length);
		
		for (int i = 0; i <length; i++) { // 0, 1, 2
			
			if (arr[i]!=i+1) { // arr[i] != i+1
				
				// arr[0] != 0+1 = 1
				// 1 != 1
				
				// arr[1] != 1+1
				// 2 != 2
				// 
				System.out.println(i+1);
				
				break;
				
			}
			
		}
			
			
		}
		
		

	

}
