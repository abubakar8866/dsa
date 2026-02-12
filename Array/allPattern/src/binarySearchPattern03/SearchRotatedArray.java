package binarySearchPattern03;

public class SearchRotatedArray {

	public static void main(String[] args) {
		
		//8️⃣ Search in rotated sorted array
		
		int[] arr = {7,8,9,1,2,3,4,5,6};
		int target = 1;
		int low = 0,high = arr.length-1;
		
		while(low <= high) {
			int mid = low+(high-low)/2;
			
			if(arr[mid] == target) {
				System.out.println(mid);
				break;
			}
			
			if(arr[low] <= arr[mid]) {
				if(target >= arr[low] && target < arr[mid]) {
					high = mid - 1;
				}else {
					low = mid + 1;
				}
			}else {
				if(target > arr[mid] && target <= arr[high]) {
					low = mid + 1;
				}else {
					high = mid - 1;
				}
			}
		}
		

	}

}
