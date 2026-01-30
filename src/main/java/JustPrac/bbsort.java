package JustPrac;

public class bbsort {

	public static void main(String[] args) {
		int[] nums = { 10, 2, 4, 33, 5, 7, 5, 2, 0, 8 };
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}

		}
		for (int n : nums) {
			System.out.print(n+" ");
		}

	}

}
