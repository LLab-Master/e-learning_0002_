package chapter13;

public class Exercise13_3Impl implements Exercise13_2Interface, Exercise13_3Interface {

	@Override
	public void print13_2() {
		System.out.println("実装した13_2のインターフェースのメソッドです。");
	}

	@Override
	public void print13_3(String str) {
		System.out.println("実装した13_3のインターフェースのメソッドです。");
		System.out.println("引数の値は" + str + "です。");

	}
}
