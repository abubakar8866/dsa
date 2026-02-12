package binarySearchPattern03;

public class BinarySrchIterative {

	public static void main(String[] args) {
		
		// 1️⃣ Binary search (iterative)
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int target = 9;
		int indx = -1;
		
		int low = 0,high = arr.length-1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) {
				indx = mid;
				break;
			}else if(arr[mid] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		System.out.println((indx > -1) ? target+" is found at "+indx+" index." : target+" is not found.");

	}

}
