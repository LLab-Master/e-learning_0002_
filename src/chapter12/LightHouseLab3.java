package chapter12;

public class LightHouseLab3 extends Office {

	private String officeDescription;

	public LightHouseLab3(String officeName, int numberOfEmployee, String officeDescription) {
		super(officeName, numberOfEmployee);
		this.officeDescription = officeDescription;
	}

	@Override
	public void printOffice() {
		super.printOffice();
		System.out.println(officeDescription);
		System.out.println("ただいまPython講座の受講者を募集中です！");
	}

	@Deprecated
	public void printOfficeName() {
		System.out.println(getOfficeName());
	}

}
