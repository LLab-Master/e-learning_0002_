package chapter11;

public class Employee11_2Use {

	public static void main(String[] args) {
		Employee11_2Instance obj = new Employee11_2Instance("田中", 22, "システム開発部");
		Employee11_2Instance obj2 = new Employee11_2Instance("高橋");
		obj.greet();
		obj2.greet();
	}

}
