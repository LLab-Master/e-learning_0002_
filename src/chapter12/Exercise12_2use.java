package chapter12;

public class Exercise12_2use {

	public static void main(String[] args) {

		Office dai1eng = new Office("第一エンジニアリング株式会社", 15);
		LightHouseLab lighthouselab = new LightHouseLab("ライトハウスラボ株式会社", 10, "横浜を拠点にしたIT教育企業です。");

		dai1eng.printOffice();
		lighthouselab.printOffice();
	}

}
