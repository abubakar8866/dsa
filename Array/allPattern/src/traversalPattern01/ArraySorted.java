package traversalPattern01;

public class ArraySorted {

	public static void main(String[] args) {
		
		//8️⃣ Check if array is sorted
		int[] arr = {1,2,3,4,-5};
		boolean isSorted = true;
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				isSorted = false;
				break;
			}
		}
		
		System.out.println((isSorted) ? "sorted." : "Not sorted.");		

	}

}
