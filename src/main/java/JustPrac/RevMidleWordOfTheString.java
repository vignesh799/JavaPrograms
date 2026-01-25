package JustPrac;

public class RevMidleWordOfTheString {

	public static void main(String[] args) {
		String sent = "Vignesh shetty is a bad boy";
		String target = "bad";
		String result = " ";
		String[] wordslist = sent.split(" ");
		for (String word : wordslist) {
			if (word.endsWith(target)) {
				String rev = " ";
				char[] charlist = word.toCharArray();
				for (char c : charlist) {
					rev = c + rev;
				}
				result = result +" "+ rev;
			} else {
				result = result +" "+ word;
			}

		}
		System.out.println(result);
	}

}
