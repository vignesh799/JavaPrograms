package JustPrac;

public class MaxMin {

	public static void main(String[] args) {
		int[] numbers = {90,3,4,5,1,9,333};
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
		System.out.println("Min number is :"+min);
	}

}
