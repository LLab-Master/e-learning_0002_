package chapter10;

public class Employee10_2Use {

	public static void main(String[] args) {
		Employee10_2Instance obj = new Employee10_2Instance();
		obj.name = "鈴木";
		obj.age = 23;
		obj.post = "第二システム開発部";
		obj.greet();
		Employee10_2Instance.office = "第一エンジニアリング";
		System.out.println("会社名は" + Employee10_2Instance.office + "です。");
	}

}
