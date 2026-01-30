package AllJavaPrograms;

public class Palindrom {

	public static void main(String[] args) {
		int intword = 121;
		String word = intword + "";
		String rev = "";
		char[] charlist = word.toCharArray();
		for (char c : charlist) {
			rev = c + rev;
		}
		if (rev.equals(word)) {
			System.out.println("it is palindrom");
		} else {
			System.out.println("it is not a palindron");
		}

	}

}
