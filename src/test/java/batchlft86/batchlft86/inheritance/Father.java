package batchlft86.batchlft86.inheritance;

public class Father {

	protected String building;

	
	public Father(String building) {
		this.building = building;
		System.out.println("calling father constructor");
	}

//	public String getBuilding() {
//		return building;
//	}

	public void setBuilding(String building) {
		this.building = building;
	}
	
	public void showMyPropertiesAddress() {
		System.out.println("Father Properties address");
	}

}
