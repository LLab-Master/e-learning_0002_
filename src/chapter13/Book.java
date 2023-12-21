package chapter13;

public abstract class Book {

	private String title;

	public Book(String title) {
		this.title = title;
	}

	abstract void print();

}
