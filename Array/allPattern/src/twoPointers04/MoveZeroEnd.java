package twoPointers04;

import java.util.Arrays;

public class MoveZeroEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,0,3,0,4,7,0};
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		
		while(index < arr.length) {
			arr[index++] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
