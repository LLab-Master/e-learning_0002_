package chapter5;

public class Exercise5_4 {

	public static void main(String[] args) {

		if (args != null) {
			System.out.println("コマンドライン引数の0番目の値は" + args[0]);
			System.out.println("コマンドライン引数の1番目の値は" + args[1]);
		} else {
			System.out.println("値が不正です。");
		}
	}
}
