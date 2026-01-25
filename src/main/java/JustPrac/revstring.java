package JustPrac;

public class revstring {

	public static void main(String[] args) {
		String word = "Vignesh shetty";
		String rev = " ";
		char[] charlist = word.toCharArray();
		for(char c : charlist) {
			rev = c + rev;
		}
		System.out.println("Rev of string is: "+rev);
	}

}
