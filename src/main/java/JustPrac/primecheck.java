package JustPrac;

public class primecheck {

	public static void main(String[] args) {
		int[] nums = { 10, 4, 1, 0, 3, 2 };

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

			if (isPrime) {
				System.out.println(num + " is a Prime number");
			} else {
				System.out.println(num + " is NOT a Prime number");
			}
		}
	}
}