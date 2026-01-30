package JustPrac;

public class checkprime {

	public static void main(String[] args) {
		int[] nums = { 10, 1, 2, 3, 4, 5,0 };

		for (int num : nums) {
			boolean isprime = true;
			if (num <= 1) {
				isprime = false;
			} else {
				for (int i = 2; i <= num; i++) {
					if (num % 2 == 0) {
						isprime = false;
					}
					if (num == 2) {
						isprime = true;
					}
				}
			}
			if (isprime) {
				System.out.println(num + " is prime");
			} else {
				System.out.println(num + " is non prime");
			}
		}

	}

}
