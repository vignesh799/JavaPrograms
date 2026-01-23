package AllJavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int[] numbers = {30,45,2,5,40};
		int count =0;
		for(int n : numbers) {
			if(n%2==0) {
				System.out.println(n);
				count++;
//				System.out.println("Count is "+count);
			}
			
		}
		System.out.println("Count is "+count);
	}

}
