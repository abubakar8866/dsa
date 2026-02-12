package linearsearchPattern02;

public class ChkEle {

	public static void main(String[] args) {
		
		//3️⃣ Check if element exists
		int[] arr = {1,2,3,4,5};
		int ele = 22;
		boolean exist = false;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				exist = true;
				break;
			}
		}
		
		System.out.println((exist) ? "Element is exists." : "Element is not exists.");
	
	}

}
