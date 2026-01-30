package AllJavaPrograms;

public class FibonaccSeries {

	public static void main(String[] args) {
		int num = 22;
		int a = 0;
		int b = 1;

		for (int i = 0; i <= num; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}

	}

}
