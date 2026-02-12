package twoPointers04;

import java.util.Arrays;

public class SquareSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-4,-2,0,1,2};
		int n = arr.length;
		int[] result = new int[n];
		int left = 0,right = n-1,index = right;
		
		while(left <= right) {
			if(Math.abs(arr[left]) > Math.abs(arr[right])) {
				result[index--] = arr[left] * arr[left];
				left++;
			}else {
				result[index--] = arr[right] * arr[right];
				right--;
			}
		}
		
		System.out.println(Arrays.toString(result));
	}

}
