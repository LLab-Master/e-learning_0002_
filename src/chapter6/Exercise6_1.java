package chapter6;

public class Exercise6_1 {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("コマンドライン引数の数は" + args.length + "です。");
		} else {
			System.out.println("コマンドライン引数に値が入力されていません。");
		}

	}

}
