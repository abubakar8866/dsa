package slidingWindow05;

import java.util.ArrayList;
import java.util.List;

public class GiveSubArrayOfKSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6};
		int k = 7;
		int left = 0,sum =0;
		List<Integer> subArray = new ArrayList<Integer>();
		
		for (int right = 0; right < arr.length; right++) {
			sum += arr[right];
			
			while(sum > k) {
				sum -= arr[left];
				left++;
			}
			
			if (sum == k) {
				for (int i = left; i <= right; i++) {
					subArray.add(arr[i]);
				}
				break;
			}			
			
		}
		
		System.out.println(subArray);
		
	}

}
