package chapter15;

public class Exercise15_2 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("こんにちは");
		builder.append("初めまして");
		builder.delete(0, 5);
		System.out.println(builder.toString());

	}

}
