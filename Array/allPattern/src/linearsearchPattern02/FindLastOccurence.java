package linearsearchPattern02;

public class FindLastOccurence {

	public static void main(String[] args) {
		
		//5 Find last occurrence
		int[] arr = {1,2,2,4,2};
		int ele = 2;
		boolean exist = false;
		int indx = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				exist = true;
				indx = i;
			}
		}
		
		System.out.println((exist) ? "Element is exists at "+indx+" index." : "Element is not exists.");
	
	}

}
