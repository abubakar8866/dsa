package slidingWindow05;

public class MinSumKSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,1,5,1,3,2};
		int k = 3;
		int windowSum = 0;
		
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		
		int minSum = windowSum;
		
		for (int i = k; i < arr.length; i++) {
			windowSum = windowSum + arr[i] - arr[i-k];
			minSum = Math.min(minSum, windowSum);
		}
		
		System.out.println(minSum);
		
	}

}
