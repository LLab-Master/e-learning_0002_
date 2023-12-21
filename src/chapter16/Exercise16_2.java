package chapter16;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise16_2 {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();

		strSet.add("ねこ");
		strSet.add("うさぎ");
		strSet.add("いぬ");
		strSet.add("からす");

		Set<String> strTreeSet = new TreeSet<String>();

		strTreeSet.add("ねこ");
		strTreeSet.add("うさぎ");
		strTreeSet.add("いぬ");
		strTreeSet.add("からす");

		System.out.println(strSet);
		System.out.println(strTreeSet);

		strSet.remove("からす");

		System.out.println(strSet);

		if (strTreeSet.contains("うさぎ")) {
			System.out.println(true);
		}

	}

}
