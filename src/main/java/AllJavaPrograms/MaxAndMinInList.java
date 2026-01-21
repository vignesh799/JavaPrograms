package AllJavaPrograms;

public class MaxAndMinInList {

	public static void main(String[] args) {
		int[] numbers = {10,2,30,40,5,2,1};
		int max = numbers[0];
		int min = numbers[0];
		for(int n : numbers) {
			if(n>max) {
				max=n;
			}
			if(n<min) {
				min=n;
			}
		}
		
		System.out.println("Max number is : "+max);
		System.out.println("Min number is : "+min);
	}

}
