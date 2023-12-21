package chapter16;

import java.util.ArrayList;
import java.util.List;

public class Exercise16_1 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();

		strList.add("red");
		strList.add("blue");
		strList.add("yellow");
		strList.add("pink");

		for (String str : strList) {
			System.out.println(str);
		}

		System.out.println(strList.size());

		System.out.println(strList.indexOf("yellow"));

		strList.set(3, "white");

		System.out.println(strList);

		strList.clear();

		if (strList.isEmpty()) {
			System.out.println(true);
			System.out.println(strList);
		}
	}

}
