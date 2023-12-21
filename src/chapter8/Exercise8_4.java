package chapter8;

public class Exercise8_4 {

	public static void main(String[] args) {
		message("山田");
		message();
	}

	static void message(String name) {
		System.out.println("こんにちは、" + name + "さん。");
	}

	static void message() {
		System.out.println("これからもよろしくね！");
	}
}
