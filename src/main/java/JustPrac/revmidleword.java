package JustPrac;

public class revmidleword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "Vignesh shetty is a bad boy";
		String target = "bad";
		String result = " ";
		String[] wordlist = words.split(" ");
		for(String word :wordlist) {
			if(word.equals(target)) {
				char[] charlist = word.toCharArray();
				String rev = " ";
				for(char c: charlist) {
					rev = c +rev;
				}
				result = result +" "+  rev;
			}else
			{
				result = result +" "+word;
			}
		}
		System.out.println(result);
	}

}
