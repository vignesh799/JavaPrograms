package AllJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class sortArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Shetty","vignesh"));

        list.add(1,"Vignesh");        // add at end
//        list.add("hello");  
//        list.reversed();// add at index 1

        System.out.println(list);
	    }

	}


