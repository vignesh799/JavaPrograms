package JustPrac;

public class revlist {

	public static void main(String[] args) {
		int[] nums = {10,3,5,3,72,1};
		String result = " ";
		for(int num :nums) {
			String n = "" +num;
			result = n+" "+result;
		}
		System.out.println(result+" ");
	}

}
