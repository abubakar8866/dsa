package binarySearchPattern03;

public class FindMinimumRotatedArray {

	public static void main(String[] args) {
		
		//9️⃣ Find minimum in rotated array
		
		int[] arr = {14,15,16,17,0,1,2,3,4,5,6,7,8,9,10,11,12,13};
		int low = 0,high = arr.length-1;
		while(low < high) {
			
			int mid = low+(high-low)/2;
			
			if(arr[mid] > arr[high]) {
				low = mid + 1;
			}else {
				high = mid;
			}
			
		}
		int maxIndex = (low-1+arr.length)%arr.length;
		System.out.println(arr[low]);
		System.out.println(arr[maxIndex]);
	}

}
