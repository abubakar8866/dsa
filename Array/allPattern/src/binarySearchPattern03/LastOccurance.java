package binarySearchPattern03;

public class LastOccurance {

	public static void main(String[] args) {
		
		//4️⃣ Find last occurrence
		
		int[] arr = {1,8,3,4,5,6,7,8,9};
		int target = 8;
		int indx = -1;
		
		int low = 0,high = arr.length-1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) {
				indx = mid;
				low = mid + 1;
			}else if(arr[mid] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		System.out.println((indx > -1) ? target+" is found at "+indx+" index." : target+" is not found.");

	}

}
