package linearsearchPattern02;

public class CountOccurence {

	public static void main(String[] args) {
		
		//6️⃣ Count occurrences of a value
		int[] arr = {1,2,2,4,2};
		int ele = 2;
		boolean exist = false;
		int c = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				exist = true;
				c++;
			}
		}
		
		System.out.println((exist) ? ele+" is exists and count = "+c : "Element is not exists.");
	
	}

}
