package traversalPattern01;

public class AvgArr {

	public static void main(String[] args) {
		
		//7️⃣ Find average of elements
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("Average = "+sum/arr.length);		

	}

}
