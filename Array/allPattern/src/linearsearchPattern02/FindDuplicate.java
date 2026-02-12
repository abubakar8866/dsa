package linearsearchPattern02;

public class FindDuplicate {

	public static void main(String[] args) {
		
		//9️⃣ Find duplicate (brute force)
		int[] arr = {7,22,3,9,22};
		boolean isDuplicate = false;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
		}
		
		System.out.println((isDuplicate) ? "Duplicate is found." : "Duplicate is not found.");
	
	}

}
