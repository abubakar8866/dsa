package linearsearchPattern02;

public class FindIndex {

	public static void main(String[] args) {
		
		//2️⃣ Find index of element
		int[] arr = {1,2,3,4,5};
		int ele = 2;
		boolean exist = false;
		int indx = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				exist = true;
				indx= i;
				break;
			}
		}
		
		System.out.println((exist) ? "Element is found at "+indx+" index." : "Element is not found.");
	
	}

}
