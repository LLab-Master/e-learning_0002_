package chapter7;

public class Exercise7_2 {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("*****コマンドライン引数の表示*****");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
	}
}
