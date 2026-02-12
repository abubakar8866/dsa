package twoPointers04;

public class CheckPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,6};
		int target = 7;
		int left = 0,right = arr.length-1;
		boolean isFound = false;
		
		while(left < right) {
			
			int sum = arr[left] + arr[right];
			
			if(target == sum){
				isFound = true;
				break;
			}else if(sum < target) {				
				left++;
			}else {				
				right--;
			}
			
		}
		
		System.out.println(isFound);
		
	}

}
