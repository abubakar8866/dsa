package traversalPattern01;

public class SecondLargestEle {

	public static void main(String[] args) {
		
		//9️⃣ Find second largest element
		int[] arr = {1,2,3,-4,5};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(first < arr[i]) {
				second = first;
				first = arr[i];
			}else if(second < arr[i] && arr[i] != first) {
				second = arr[i];
			}
		}
		
		System.out.println("First = "+first);
		System.out.println("Second = "+second);

	}

}
