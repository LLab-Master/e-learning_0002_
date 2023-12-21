package chapter10;

public class Employee10_3Use {

	public static void main(String[] args) {
		Employee10_3Instance obj = new Employee10_3Instance();
		obj.name = "山田";
		obj.age = 19;
		obj.post = "総務部";
		obj.greet();
		System.out.println("会社名は" + Employee10_3Instance.OFFICE + "です。");
	}

}
