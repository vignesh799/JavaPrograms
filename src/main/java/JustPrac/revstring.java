package JustPrac;

public class revstring {

	public static void main(String[] args) {
		String word = "Vignesh Shetty";
		String rev ="";
		char[] charlist = word.toCharArray();
		for(char c : charlist) {
			rev = c+rev;
		}
		System.out.println("Rev of word : "+rev);

	}

}
