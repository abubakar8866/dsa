package binarySearchPattern03;

public class CountOccurances {

	public static void main(String[] args) {
		
		//5️⃣ Count occurrences
		
		int[] arr = {1,1,1,1,2,3,4,5,6,7,8,8,9};
		int target = 8;
		int firstIndex = -1;
		int lastIndex = -1;
		
		int low = 0,high = arr.length-1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) {
				firstIndex = mid;
				high = mid - 1;
			}else if(arr[mid] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		low = 0;
		high = arr.length-1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) {
				lastIndex = mid;
				low = mid + 1;
			}else if(arr[mid] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		int c = ((lastIndex-firstIndex+1)>0) ? lastIndex-firstIndex+1 : -1;
		
		System.out.println((c > -1) ? target+" is found and count =  "+c : target+" is not found.");

	}

}
