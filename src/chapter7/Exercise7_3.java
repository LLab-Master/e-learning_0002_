package chapter7;

import java.util.Random;

public class Exercise7_3 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			int randamNum = new Random().nextInt(50) + 1;
			if (randamNum % 2 == 0) {
				System.out.println(randamNum);
			}

		}

	}
}