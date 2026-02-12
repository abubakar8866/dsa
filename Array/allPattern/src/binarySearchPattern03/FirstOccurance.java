package binarySearchPattern03;

public class FirstOccurance {

	public static void main(String[] args) {
		
		// 3️⃣ Find first occurrence
		
		int[] arr = {1,2,3,4,5,6,7,2,8};
		int target = 2;
		int indx = -1;
		
		int low = 0,high = arr.length-1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) {
				indx = mid;
				high = mid - 1;
			}else if(arr[mid] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		System.out.println((indx > -1) ? target+" is found at "+indx+" index." : target+" is not found.");

	}

}
