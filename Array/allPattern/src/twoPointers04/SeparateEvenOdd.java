package twoPointers04;

import java.util.Arrays;

public class SeparateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index++] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
