package chapter5;

public class Exercise5_2 {

	public static void main(String[] args) {
		int[][] intArry = new int[2][3];

		intArry[0][0] = 5;
		intArry[0][1] = 10;
		intArry[0][2] = 15;
		intArry[1][0] = 20;
		intArry[1][1] = 25;
		intArry[1][2] = 30;

		System.out.println("intArryの[0][0]の値は" + intArry[0][0] + "です。");
		System.out.println("intArryの[0][1]の値は" + intArry[0][1] + "です。");
		System.out.println("intArryの[0][2]の値は" + intArry[0][2] + "です。");
		System.out.println("intArryの[1][0]の値は" + intArry[1][0] + "です。");
		System.out.println("intArryの[1][1]の値は" + intArry[1][1] + "です。");
		System.out.println("intArryの[1][2]の値は" + intArry[1][2] + "です。");

	}

}
