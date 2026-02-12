package linearsearchPattern02;

public class searchEle {

	public static void main(String[] args) {
		
		//1️⃣ Search an element in array
		int[] arr = {1,2,3,4,5};
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
