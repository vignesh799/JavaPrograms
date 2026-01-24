package JustPrac;

public class bbsort {

	public static void main(String[] args) {
		String word = "1 2 3 4 5 6 7 8 9 a";
		int count = 0;
		char[] charlist = word.toCharArray();
		for (char c : charlist) {
			if(c != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
