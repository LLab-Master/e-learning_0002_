package chapter6;

import java.util.Scanner;

public class Exercise6_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("あなたの年齢を教えてください：");
		int age = scan.nextInt();

		if (age >= 20) {
			System.out.println("成人です。");
		} else if (age == 18 || age == 19) {
			System.out.println("成人ですが、飲酒は喫煙はできません。");
		} else if (age >= 0 && age <= 17) {
			System.out.println("未成年です。");
		} else {
			System.out.println("値が不正です。");
		}

	}

}
