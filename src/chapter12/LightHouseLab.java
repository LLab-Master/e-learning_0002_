package chapter12;

public class LightHouseLab extends Office {

	private String officeDescription;

	public LightHouseLab(String officeName, int numberOfEmployee, String officeDescription) {
		super(officeName, numberOfEmployee);
		this.officeDescription = officeDescription;
	}

}
