package chapter10;

public class Employee10_4Instance {
	String name;
	int age;
	String post; // 部署

	private String address = "横浜市磯子区";

	void greet() {
		System.out.println("はじめまして");
		System.out.println(name + "と申します。" + age + "才です。");
		System.out.println("所属は" + post + "です。");
		System.out.println("よろしくお願いします。");
	}

}
