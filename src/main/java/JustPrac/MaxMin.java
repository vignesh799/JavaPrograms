package JustPrac;

public class maxmin {

	public static void main(String[] args) {
		int[] numbers = {10,50,22,5,30,20};
		int max = numbers[0];
		int min = numbers[0];
		for(int num : numbers) {
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		}
System.out.println("Max numbers is :"+max);
System.out.println("Min nuber is : "+min);
	}

}
