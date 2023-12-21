package chapter4;

import java.util.Scanner;

public class Exercise4_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("名前を入力してください：");
		String name = scan.nextLine();
		System.out.print("誕生日を入力してください：");
		int birth = scan.nextInt();

		System.out.println("こんにちは、私の名前は" + name + "です。誕生日は" + birth + "月です。よろしくお願いします。");
	}

}
