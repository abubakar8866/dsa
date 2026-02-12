package practice;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

		/*
			1️⃣ Reverse an array
			2️⃣ Check palindrome
			3️⃣ Pair with given sum (sorted array)
			4️⃣ Remove duplicates from sorted array
			5️⃣ Move all zeros to end
			6️⃣ Separate even and odd numbers
			7️⃣ Merge two sorted arrays
			8️⃣ Square sorted array
			9️⃣ Sort array of 0s, 1s, 2s
			🔟 Trapping rain water
		 */

		int[] height = {4,2,0,3,2,5};
		int low = 0,high = height.length-1,water=0,leftMax = Integer.MIN_VALUE,rightMax=Integer.MIN_VALUE;
		
		while(low < high) {
			if(height[low] <= height[high]) {
				if(height[low] > leftMax) {
					leftMax = height[low];
				}else {
					water += leftMax - height[low];
				}
				low++;
			}else {
				if(height[high] > rightMax) {
					rightMax = height[high];
				}else {
					water += rightMax - height[high];
				}
				high--;
			}
		}
		
		System.out.println(water);
		
	}

}
