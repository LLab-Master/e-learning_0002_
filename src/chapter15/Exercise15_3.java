package chapter15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise15_3 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日('E'曜日)'k'時'mm'分'ss'秒'");
		System.out.println(sdf.format(date));

	}

}
