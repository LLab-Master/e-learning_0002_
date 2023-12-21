package chapter13;

public class Exercise13_1Use {

	public static void main(String[] args) {
		Book[] books = { new Novel("吾輩は猫である"),
				new Manga("名探偵コナン") };

		for (Book book : books) {
			book.print();
		}

	}

}
