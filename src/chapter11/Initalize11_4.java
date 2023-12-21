package chapter11;

public class Initalize11_4 {

	private String name;

	static {
		System.out.println("static初期化ブロックが呼ばれました。");
	}

	{

		name = "名無し";
		System.out.println("nameの値は" + name + "です。");

	}

	public Initalize11_4() {
		name = "山本";
		System.out.println("nameの値は" + name + "です。");
	}

	public static void main(String[] args) {
		new Initalize11_4();
		new Initalize11_4();

	}

}
