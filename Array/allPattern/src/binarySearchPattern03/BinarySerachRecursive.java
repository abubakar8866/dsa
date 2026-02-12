package binarySearchPattern03;

public class BinarySerachRecursive {

	public static void main(String[] args) {
		
		//2️⃣ Binary search (recursive)
		int[] arr = {1,2,3,4,5,6,7,8};
		int target = 65;
		int indx = -1;
		
		int ans = binarySearch(arr, 0, arr.length-1, target,indx);
		
		System.out.println((ans > -1) ? target+" is found at "+ans+" index." : target+" is not found.");

	}
	
	public static int binarySearch(int[] arr,int low,int high,int target,int indx) {
		
		if (low > high) return -1;
		
		int mid = low + (high - low) / 2;
		
		if(arr[mid] == target) {
			indx = mid;
			return indx;
		}else if(arr[mid] < target) {
			return binarySearch(arr, mid + 1, high, target,indx);
		}else {
			return binarySearch(arr, low, mid - 1, target, indx);
		}
		
	}

}
