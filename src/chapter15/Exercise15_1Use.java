package chapter15;

public class Exercise15_1Use {

	public static void main(String[] args) {

		Exercise15_1 obj = null;

		if (args.length != 0) {
			obj = new Exercise15_1(args[0], Integer.parseInt(args[1]));
		} else {
			obj = new Exercise15_1(null, 0);
		}
		System.out.println(obj.toString());
	}

}
