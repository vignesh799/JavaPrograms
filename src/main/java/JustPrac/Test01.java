package JustPrac;

public class Test01 {

	public static void main(String[] args) {
		int[] numberlist = { 10, 399, 7, 20, 40, 2,1,1 };
		int max = numberlist[0];
		int min = numberlist[0];
		for (int n : numberlist) {
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}
		System.out.println("Max number in list is :" + max);
		System.out.println("Min number in list is :" + min);
	}

}
