package JustPrac;

public class revchar {

	public static void main(String[] args) {
		String word = "Vignesh shetty";
		char charlist[] = word.toCharArray();
		String rev = " ";
		for (char c : charlist) {
			if(c!=' ') {
			rev = c + rev;
			}
		}
		System.out.println(rev);
	}

}
