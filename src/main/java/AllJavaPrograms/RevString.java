package AllJavaPrograms;

public class RevString {

	public static void main(String[] args) {
		String word ="Vignesh shetty";
		String rev ="";
		char[] charlist = word.toCharArray();
		for(char c : charlist) {
			if(c!=' ') {
			rev =c+rev;
			}
		}
System.out.println("Rev Value "+rev);
	}

}
