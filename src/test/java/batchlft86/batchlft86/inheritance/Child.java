package batchlft86.batchlft86.inheritance;

public class Child extends Father{
	
	private String childOwnPro;
	
	public Child(String building, String ownPro) {
		super(building);
		this.childOwnPro = ownPro;
		System.out.println("calling the construtor of Child");
	}

	public void getProperties() {
//		System.out.println(super.getBuilding());
		System.out.println("Father Properties => "+building);
		System.out.println("Child Own Properties =>"+childOwnPro);
	}
	
	@Override
	public void showMyPropertiesAddress() {
		System.out.println("Child Properties address");
	}
}
