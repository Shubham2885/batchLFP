package batchlft86.batchlft86;

//it's example of Enclapsulation
public class Vehical {

	//properties -> 
	String name;
	int numberOfGeer;
	int maxSpeed;
	String model;
	String brand;
	int numberOfWeels;
	String color;
	
//	public Vehical() {
//		name = "XUV700";
//		numberOfGeer = 5;
//		maxSpeed = 180;
//		model = "AX7";
//		brand = "Maruti";
//		numberOfWeels = 4;
//		color = "Blue";
//	}
	
	
	
	//behaviours -> functioning
	
	public void driving() {
		System.out.println("Driving with "+maxSpeed + " this speed");
	}
	
//	public Vehical(String name, int numberOfGeer, int maxSpeed, String model, String brand, int numberOfWeels,
//			String color) {
//		this.name = name;
//		this.numberOfGeer = numberOfGeer;
//		this.maxSpeed = maxSpeed;
//		this.model = model;
//		this.brand = brand;
//		this.numberOfWeels = numberOfWeels;
//		this.color = color;
//	}

	public void accelator() {
		System.out.println("Accelate");
	}
	
	public void applyingBreak() {
		
	}

	@Override
	public String toString() {
		return "Vehical [name=" + name + ", numberOfGeer=" + numberOfGeer + ", maxSpeed=" + maxSpeed + ", model="
				+ model + ", brand=" + brand + ", numberOfWeels=" + numberOfWeels + ", color=" + color + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfGeer() {
		return numberOfGeer;
	}

	public void setNumberOfGeer(int numberOfGeer) {
		this.numberOfGeer = numberOfGeer;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumberOfWeels() {
		return numberOfWeels;
	}

	public void setNumberOfWeels(int numberOfWeels) {
		this.numberOfWeels = numberOfWeels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
