package binarySearchPattern03;

public class FloorEle {

	public static void main(String[] args) {
		
		//6️⃣ Find floor of an element
		
		int[] arr = {1,2,5,6,7,8};
		int target = 4;
		int floor = -1;
		
		int low = 0,high = arr.length-1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] <= target) {
				floor = arr[mid];
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		System.out.println(floor);

	}

}
