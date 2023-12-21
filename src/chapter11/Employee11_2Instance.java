package chapter11;

public class Employee11_2Instance {
	private String name;
	private int age;
	private String post;

	public Employee11_2Instance(String name, int age, String post) {
		this.name = name;
		this.age = age;
		this.post = post;
	}

	public Employee11_2Instance(String name) {
		this.name = name;
	}

	void greet() {
		System.out.println("はじめまして");
		System.out.println(name + "と申します。" + age + "才です。");
		System.out.println("所属は" + post + "です。");
		System.out.println("よろしくお願いします。");
	}

}
