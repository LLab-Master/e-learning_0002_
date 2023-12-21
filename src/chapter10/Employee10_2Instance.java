package chapter10;

public class Employee10_2Instance {
	String name;
	int age;
	String post; // 部署

	static String office;

	void greet() {
		System.out.println("はじめまして");
		System.out.println(name + "と申します。" + age + "才です。");
		System.out.println("所属は" + post + "です。");
		System.out.println("よろしくお願いします。");
	}

}
