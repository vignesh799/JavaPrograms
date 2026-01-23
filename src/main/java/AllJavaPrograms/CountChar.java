package AllJavaPrograms;

public class CountChar {

	public static void main(String[] args) {
		String Word = "1 2 3 4 5 6";
		int count = 0;
		char[] charlist = Word.toCharArray();
		for (char c : charlist) {
			if(c != ' ') {
				count++;
			}
		}
		System.out.println("Count is :" + count);
	}

}
