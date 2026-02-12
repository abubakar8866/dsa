package traversalPattern01;

public class FindFrequencyEle {

	public static void main(String[] args) {
		
		//1️⃣ Find sum of array
		int[] arr = {11,23,3,40,5,23};
		int ele = 23;
		int count = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			if(ele == arr[i]) {				
				count++;
			}
		}
		
		System.out.println("Frequency = " + count);
		System.out.println("Relative Frequency = " + (double) count / arr.length);

	}

}
