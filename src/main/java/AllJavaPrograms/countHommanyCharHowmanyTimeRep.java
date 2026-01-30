package AllJavaPrograms;

public class countHommanyCharHowmanyTimeRep {

	public static void main(String[] args) {
		String word = "Vignesh shetty";
		char[] charlist = word.toCharArray();

		for(char ch :charlist) {
			int count = 0;
			if(ch==' ')continue;
			for(char c :charlist) {
				if(ch==c) {
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}
	}

}
