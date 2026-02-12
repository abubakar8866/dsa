package traversalPattern01;

public class PrintArrReverse {

	public static void main(String[] args) {
		
		//6️⃣ Print array in reverse
		int[] arr = {1,0,0,4,5};
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}		

	}

}
