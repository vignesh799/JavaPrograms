package JustPrac;

public class bobsort {

	public static void main(String[] args) {
		int[] numbers = {10,3,20,70,11};
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]<numbers[j+1]){
					int temp = numbers[j];
					numbers[j] =numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		for(int n:numbers) {
			System.out.print(n+" ");
		}

	}

}
