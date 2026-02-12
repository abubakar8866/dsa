package twoPointers04;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2,3,1};
		int left = 0;
		int right = arr.length-1;
		boolean isPalindrome = true;
		
		while(left < right) {
			
			if(arr[left] != arr[right]) {
				isPalindrome = false;
				break;
			}
			
			left++;
			right--;
		}
		
		System.out.println(isPalindrome);
		
	}

}
