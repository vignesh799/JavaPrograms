package JustPrac;

public class MidleWordRev {

	public static void main(String[] args) {
		String word = "Vignesh shetty is good boy";
		String target = "is";
		String result = " ";
	
		String[] wordlist = word.split(" ");
		for(String w : wordlist) {
			if(w.equals(target)){
				String rev =" ";
				char[] charlist = w.toCharArray();
				for(char c : charlist) {
					rev = c+rev;
				}
				result=  result +" " +rev;
			}else {
				result= result +" "+ w;
			}
			
		}
		System.out.println(result);
	}

}
