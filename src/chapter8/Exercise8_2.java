package chapter8;

public class Exercise8_2 {

	public static void main(String[] args) {
		int num1 = lengthStr("こんにちは");

		System.out.println("文字数は" + num1);

	}

	static int lengthStr(String str) {

		int resultLength;

		if (str != null) {
			resultLength = str.length();
		} else {
			resultLength = 0;
		}
		return resultLength;
	}
}
