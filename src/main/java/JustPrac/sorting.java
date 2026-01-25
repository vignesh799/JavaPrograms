package JustPrac;

public class sorting {

	public static void main(String[] args) {
		int[] nums = {50,33,5,2,55,7,44,32};
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for(int n : nums) {
			System.out.print(n+" ");
		}
	}

}
