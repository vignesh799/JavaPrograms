package JustPrac;

public class CheckPrimeAndCount {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int num : nums) {
			boolean isPrime = true;

			if (num <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime)
				System.out.println(num + " is Prime");
			else
				System.out.println(num + " is Not Prime");
		}
	}

}
