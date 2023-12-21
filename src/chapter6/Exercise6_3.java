package chapter6;

import java.util.Scanner;

public class Exercise6_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("和名を表示したい月を入力してください：");
		int month = scan.nextInt();

		switch (month) {
		case 1:
			System.out.println("睦月(むつき)");
			break;
		case 2:
			System.out.println("如月(きさらぎ)");
			break;
		case 3:
			System.out.println("弥生(やよい)");
			break;
		case 4:
			System.out.println("卯月(うづき)");
			break;
		case 5:
			System.out.println("皐月(さつき)");
			break;
		case 6:
			System.out.println("水無月(みなづき)");
			break;
		case 7:
			System.out.println("文月(ふづき)");
			break;
		case 8:
			System.out.println("葉月(はづき)");
			break;
		case 9:
			System.out.println("長月(ながつき)");
			break;
		case 10:
			System.out.println("神無月(かんなづき)");
			break;
		case 11:
			System.out.println("霜月(しもつき)");
			break;
		case 12:
			System.out.println("師走(しわす)");
			break;
		default:
			System.out.println("不正な値です。");
			break;
		}

	}

}
