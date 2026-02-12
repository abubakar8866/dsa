package slidingWindow05;

import java.util.ArrayList;
import java.util.List;

public class AverageKSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,1,3,2};
		int k = 3;
		int windowSum = 0;
		
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		
		List<Double> average = new ArrayList<>();
		average.add((double) (windowSum/k));
		
		for (int i = k; i < arr.length; i++) {
			windowSum = windowSum + arr[i] - arr[i-k];
			average.add((double) (windowSum/k));
		}
		
		System.out.println(average);
	}

}
