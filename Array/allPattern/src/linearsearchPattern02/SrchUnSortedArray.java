package linearsearchPattern02;

public class SrchUnSortedArray {

	public static void main(String[] args) {
		
		//7️⃣ Search in unsorted array
		int[] arr = {7,22,3,9,5};
		int ele = 22;
		boolean exist = false;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				exist = true;
				break;
			}
		}
		
		System.out.println((exist) ? "Element is found." : "Element is not found.");
	
	}

}
