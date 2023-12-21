package chapter14;

public class Exercise14_4UseExcption {

	public static void main(String[] args) {
		try {
			printArgs(args);
		} catch (Exercise14_3Excption e) {
			e.errMessage();
		}
	}

	static void printArgs(String[] args) throws Exercise14_3Excption {

		if (args.length != 0) {
			System.out.println("1つめのコマンドライン引数は" + args[0] + "です。");
		} else {
			throw new Exercise14_3Excption();
		}
	}

}
