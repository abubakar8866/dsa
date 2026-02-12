package twoPointers04;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,3,4,4,5};
		int left = 0;
		
		for (int right = 1; right < arr.length; right++) {
			
			if(arr[left] != arr[right]) {
				left++;
				arr[left] = arr[right];
			}
			
			
		}
		
		for (int i = 0; i < left+1; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
