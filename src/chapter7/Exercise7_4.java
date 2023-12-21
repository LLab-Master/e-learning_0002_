package chapter7;

public class Exercise7_4 {

	public static void main(String[] args) {
		int x, y;
		for (x = 0; x < 10; x++) {
			for (y = 0; y < x + 1; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}