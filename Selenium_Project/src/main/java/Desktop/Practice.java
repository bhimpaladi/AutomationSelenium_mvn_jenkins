package Desktop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

	public static int max(int[] numbers1) {

		int max = 0;
		for (int i = 0; i < numbers1.length; i++) {
			if (numbers1[i] > max) {
				max = numbers1[i];
			}
		}
		System.out.println("Max number in array"+ max);
		return max;
	}

	public void notAvailableNumbersprint() {

		// TODO Auto-generated method stub

		int[] numbers = { 10, 20, 0, 5, 15, 25 };
		int[] notavabale;
		boolean flag = true;
		// Arrays.sort(numbers, 0, numbers.length);
		for (int i = 0; i <= Practice.max(numbers); i++) {
			flag = true;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					// System.out.println(i +"available");
					flag = false;
				}
			}
			if (flag) {
				System.out.println(i + "not available");
			}
		}
	}

	public void notAvanumbersCollections() {
		Integer[] numbers = { 10, 20, 0, 5, 15, 25 };
		List<Integer> l = new ArrayList<>();
		l = Arrays.asList(numbers);

		// Arrays.sort(numbers);
		for (int i = 0; i < Collections.max((Arrays.asList(numbers))); i++) {
			// System.out.println(i);
			if (!l.contains(i)) {
				System.out.println(i);
			}

		}
	}
	
	public void regexexmp() {
		String s = "I am good @Mahesh@ maths";
		System.out.println(s);
		Pattern p = Pattern.compile("[^a-zA-Z0-9\\s]");
		Matcher m=p.matcher(s);
		while (m.find()) {
		//	System.out.println(m.toMatchResult());
			System.out.println(m.start());
			System.out.println(m.end());
			/*System.out.println(m.group());
			System.out.println(s.subSequence(m.start(), m.end()));*/
			//System.out.println(m.regionEnd());
			
		}
		
		
	}

	public static void main(String[] args) {
	

	}

}
