package chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Exercise15_4 {

	public static void main(String[] args) {
		fileList();
		String returnFileName = fileWrite();
		fileRead(returnFileName);
	}

	public static void fileList() {
		File file = new File("src/chapter15");
		String[] list = file.list();
		System.out.println("ファイルリストを出力します。");
		for (String f : list) {
			System.out.println(f);
		}
	}

	public static String fileWrite() {
		String fileName = "";
		try {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			fileName = "sample_" + hour + minute + second + ".txt";
			BufferedWriter br = new BufferedWriter(new FileWriter(fileName));
			br.write("あいうえお");
			br.newLine(); // 改行
			br.write("かきくけこ");
			br.flush();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileName;

	}

	public static void fileRead(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String s;
			System.out.println("ファイルの内容を出力します。");
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
