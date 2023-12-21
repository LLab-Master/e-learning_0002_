package chapter13;

public class Novel extends Book {

	public Novel(String title) {
		super(title);
	}

	@Override
	void print() {
		System.out.println("小説です。");
	}

}
