package twoPointers04;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,5};
		int[] arr2 = {1,4,6};
		int ans[] = new int[arr1.length+arr2.length];
		int p1 = 0,p2 = 0,i = 0;
		
		while (p1 < arr1.length && p2 < arr2.length) {
			
			if(arr1[p1] < arr2[p2]) {
				ans[i++] = arr1[p1++];
			}else {
				ans[i++] = arr2[p2++];
			}
			
		}
		
		while(p1 < arr1.length) {
			ans[i++] = arr1[p1++]; 
		}
		
		while(p2 < arr2.length) {
			ans[i++] = arr2[p2++];
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
