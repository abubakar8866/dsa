package binarySearchPattern03;

public class PeekElement {

	public static void main(String[] args) {
		
		//🔟 Peak element in array
		int[] arr = {1,2,3,4};
		int low = 0,high = arr.length-1;
		
		while(low < high) {
			int mid = low+(high-low)/2;
			
			if(arr[mid] < arr[mid+1]) {
				low = mid + 1;
			}else {
				high = mid;
			}
		}
		System.out.println(arr[low]);

	}

}
