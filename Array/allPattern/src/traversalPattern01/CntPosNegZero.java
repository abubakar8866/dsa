package traversalPattern01;

public class CntPosNegZero {

	public static void main(String[] args) {
		
		//5️⃣ Count positive, negative, zero
		int[] arr = {1,0,0,4,-5};
		int pos = 0,neg = 0,zero = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				pos++;
			}else if (arr[i] < 0){
				neg++;
			}else {
				zero++;
			}
		}
		
		System.out.println("Positive = "+pos+",Negative = "+neg+",Zero = "+zero);		

	}

}
