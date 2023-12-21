package chapter14;

public class Exercise14_2 {
	public static void main(String[] args) {
		try {
			System.out.println("1つめのコマンドライン引数は" + args[0] + "です。");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("コマンドライン引数が指定されていません。");
			e.printStackTrace();
		} finally {
			System.out.println("プログラムを終了します。");
		}
	}
}
