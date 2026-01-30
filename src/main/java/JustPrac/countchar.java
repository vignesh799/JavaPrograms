package JustPrac;

public class countchar {

	public static void main(String[] args) {
		String word = "Vignesh shettyi";
		char[] arr = word.toCharArray();

		for (char ch : arr) {

			if (ch == ' ')
				continue; // skip space

			int count = 0;

			for (char c : arr) {
				if (c == ch) {
					count++;
				}
			}

			System.out.println(ch + " = " + count);
		}
	}

}
