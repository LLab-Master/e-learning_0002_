package chapter11;

public class Employee11_3Use {

	public static void main(String[] args) {
		Employee11_3Instance obj = new Employee11_3Instance("渡辺", 45, "第二システム開発部");
		obj.setAge(25);
		System.out.println(obj.getPost() + "所属の" + obj.getName() + "さんは" + obj.getAge() + "才です。");
	}

}
