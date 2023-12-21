package chapter7;

public class Exercise7_1 {

	public static void main(String[] args) {
		int count = 0;
		if (args.length > 0) {
			System.out.println("*****コマンドライン引数の表示*****");
			while (count < args.length) {
				System.out.println(args[count]);
				count++;
			}
		}

	}

}
