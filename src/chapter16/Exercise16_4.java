package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise16_4 {

	public static void main(String[] args) {
		arrayConvList();
		listConvArray();

	}

	public static void arrayConvList() {
		String[] strArry = { "Java", "Python", "Ruby", "PHP" };
		List<String> strList = Arrays.asList(strArry);
		for (String str : strList) {
			System.out.println(str);
		}
	}

	public static void listConvArray() {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
		intList.add(200);
		intList.add(300);
		intList.add(400);
		Object[] intObj = intList.toArray();
		for (Object obj : intObj) {
			System.out.println((Integer) obj);
		}
	}
}
