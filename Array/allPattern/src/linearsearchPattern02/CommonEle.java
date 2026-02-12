package linearsearchPattern02;

public class CommonEle {

	public static void main(String[] args) {
		
		//🔟 Find common elements in two arrays
		int[] arr = {7,22,3,9,2};
		int[] arr2 = {19,8,5,12,5};
		boolean isFound = false;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr[i] == arr2[j]) {
					isFound = true;
					break;
				}
			}
		}
		
		System.out.println((isFound) ? "Common Element is found." : "Common Element is not found.");
		
		/*
		int[] arr = {1,2,3,4,5,3};
		int[] arr1 = {3,3,90,4};
		int[] isFound = new int[128];
		
		for (int i = 0; i < arr.length; i++) {
			if(isFound[arr[i]] > 1) continue;
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i] == arr1[j]) {
					isFound[arr[i]]++;
				}
			}
			System.out.println(arr[i]+" is come "+isFound[arr[i]]+" times.");
		}
		 */
	
	}

}
