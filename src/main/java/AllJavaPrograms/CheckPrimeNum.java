package AllJavaPrograms;

public class CheckPrimeNum {

	public static void main(String[] args) {
		int[] nums = {20,30,0,1,2,3,46,77,8};
		
		for(int num: nums) {
			boolean isprime = true;
			if(num<=1) {
				isprime =false;
			}
			else {
				for(int i=2;i<=num;i++) {
					if(num%2==0) {
						isprime=false;
					}
				}
			}
			if(isprime) {
				System.out.println(num+" is prime");
			}
			else
			{
				System.out.println(num+ " is not prime");
			}
			
		}
	}

}
