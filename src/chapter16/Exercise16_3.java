package chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise16_3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("red", "赤");
		map.put("blue", "青");
		map.put("yellow", "黄色");
		map.put("pink", "桃色");

		Set<String> keySet = map.keySet();

		for (String key : keySet) {
			System.out.println(key + "の日本語は" + map.get(key) + "です。");
		}

		System.out.println(map.values());

	}

}
