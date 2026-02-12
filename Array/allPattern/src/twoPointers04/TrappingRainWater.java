package twoPointers04;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] height = {3,0,2,0,4};
		
		int left = 0,right = height.length-1,water = 0,leftMax = 0,rightMax = 0;
		
		while(left < right) {
			
			if(height[left] < height[right]) {
				if(height[left] >= leftMax) {
					leftMax = height[left];
				}else {
					water += leftMax - height[left];
				}
				left++;
			}else {
				if(height[right] >= rightMax) {
					rightMax = height[right];
				}else {
					water += rightMax - height[right];
				}
				right--;
			}
			
		}
		
		System.out.println(water);
		
	}

}
