package chapter6;

import java.util.Scanner;

public class Exercise6_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("あなたの血液型を教えてください！（1.A型, 2.B型, 3.O型, 4.AB型）：");
		int bloodType = scan.nextInt();

		if (bloodType == 1) {
			System.out.println("あなたの血液型はA型ですね。");
		} else if (bloodType == 2) {
			System.out.println("あなたの血液型はB型ですね。");
		} else if (bloodType == 3) {
			System.out.println("あなたの血液型はO型ですね。");
		} else if (bloodType == 4) {
			System.out.println("あなたの血液型はAB型ですね。");
		} else {
			System.out.println("あなたの血液型は不明です…。");
		}

	}

}
