package AllJavaPrograms;

public class RevSomeMidleWordINString {

	public static void main(String[] args) {
		String Sent = "Vignesh shetty is my name";
		String target = "shetty";
		String result = " ";
		
		
		String[] Sentlist = Sent.split(" ");
		for (String word : Sentlist) {
			if (word.equals(target)) {
				String rev = " ";
				char[] charlist = word.toCharArray();
				for (char c : charlist) {
					rev = c + rev;
				}
				result = result + rev + " ";
			} else {
				result = result + word + " ";
			}

		}
		System.out.println(result.trim());
	}

}
