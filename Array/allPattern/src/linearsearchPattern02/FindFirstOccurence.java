package linearsearchPattern02;

public class FindFirstOccurence {

	public static void main(String[] args) {
		
		//4️⃣ Find first occurrence
		int[] arr = {1,2,3,4,2};
		int ele = 2;
		boolean exist = false;
		int indx = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				exist = true;
				indx = i;
				break;
			}
		}
		
		System.out.println((exist) ? "Element is exists at "+indx+" index." : "Element is not exists.");
	
	}

}
