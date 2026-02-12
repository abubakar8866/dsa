package binarySearchPattern03;

public class CeilEle {

	public static void main(String[] args) {
		
		//7️⃣ Find ceil of an element
		
		int[] arr = {1,2,5,6,7,8};
		int target = 4;
		int ceil = -1;
		
		int low = 0,high = arr.length-1;
		
		while (low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] >= target) {
				ceil = arr[mid];
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		
		System.out.println(ceil);

	}

}
