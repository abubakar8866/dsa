package traversalPattern01;

public class MaxEle {

	public static void main(String[] args) {
		
		//2 Find maximum element
		int[] arr = {1,2,3,4,5};
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Max = "+max);		

	}

}
