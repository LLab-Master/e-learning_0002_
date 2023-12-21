package chapter13;

public class Manga extends Book {

	public Manga(String title) {
		super(title);
	}

	@Override
	void print() {
		System.out.println("漫画です。");
	}

}
