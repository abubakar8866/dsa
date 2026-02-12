package linearsearchPattern02;

public class FindMissingElement {

	public static void main(String[] args) {
		
		//8️⃣ Find missing element (simple way)
		int[] arr = {7,22,3,9,5};
		int ele = 23;
		boolean exist = false;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				exist = true;
				break;
			}
		}
		
		System.out.println((exist) ? "Element is found." : "Element is missing.");
	
	}

}
