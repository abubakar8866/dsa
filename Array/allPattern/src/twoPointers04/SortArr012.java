package twoPointers04;

import java.util.Arrays;

public class SortArr012 {

	public static void main(String[] args) {
		// DutchNationalFlag
		
		int[] arr = {2,0,2,1,1,0};
		int left=0,mid=0,right=arr.length-1;
		
		while(mid <= right) {
			
			if(arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[left];
				arr[left] = temp;
				left++;
				mid++;
				System.out.println(Arrays.toString(arr));
			}else if(arr[mid] == 1) {
				mid++;
				System.out.println(Arrays.toString(arr));
			}else {
				int temp = arr[mid];
				arr[mid] = arr[right];
				arr[right] = temp;
				right--;
				System.out.println(Arrays.toString(arr));
			}
			
		}
				

	}

}
