package chapter12;

public class Office {

	private String officeName;
	private int numberOfEmployee;

	public Office(String officeName, int numberOfEmployee) {
		this.officeName = officeName;
		this.numberOfEmployee = numberOfEmployee;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	public void printOffice() {
		System.out.println(officeName + "の社員数は" + numberOfEmployee + "人です。");
	}

}
