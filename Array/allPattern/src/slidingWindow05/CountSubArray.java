package slidingWindow05;

public class CountSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,6,7,8,9};
		int k = 3;
		int count = 1;
		
		for (int i = k; i < arr.length; i++) {
			
			count++;
			
		}
		
		//count = arr.length-k+1
		
		System.out.println(count);
		
	}

}
