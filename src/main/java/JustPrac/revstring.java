package JustPrac;

public class revstring {

	public static void main(String[] args) {
		String word = "Vignesh vignesh shetty";
		String rev = "";
		char[] listchar = word.toCharArray();
		for (char c : listchar) {
			if (c != ' ') {
				rev = c + rev;
			}
		}
		System.out.println("Rev string is :" + rev);

	}

}
