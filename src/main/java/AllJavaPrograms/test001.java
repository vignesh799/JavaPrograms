package AllJavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test001 {

	public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 2, 9, 1, 3);

        Collections.sort(list);
        System.out.println("sort: " + list);

        Collections.reverse(list);
        System.out.println("reverse: " + list);

        Collections.shuffle(list);
        System.out.println("shuffle: " + list);
	}

}
