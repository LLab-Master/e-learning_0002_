package chapter15;

public class Exercise15_1 {

	private String name;
	private int price;

	public Exercise15_1(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {

		String str = "";

		if (name != null && price > 0) {
			str = "商品名：" + name + " 金額：" + price + "円";
		} else {
			str = "商品名と金額の値を表示できません。";
		}
		return str;
	}

}
