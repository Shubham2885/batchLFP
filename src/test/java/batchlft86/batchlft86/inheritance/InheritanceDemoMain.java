package batchlft86.batchlft86.inheritance;

public class InheritanceDemoMain {

	public static void main(String[] args) {
//		Child child = new Child("2BHK","3BHK");
		
		Father obj = new Child("2BHK","3BHK");

		
		obj.showMyPropertiesAddress();

		IDemo demo = new DemoImpl();
		
		DemoImpl demoImpl = new  DemoImpl();
		
		System.out.println(IDemo.printSomething());
		
		demo.print();
		
		System.out.println(IDemo.constantValue);
//		child.getProperties();
	}
}
