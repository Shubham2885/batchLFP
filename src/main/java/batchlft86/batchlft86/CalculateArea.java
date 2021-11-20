package batchlft86.batchlft86;

public class CalculateArea {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double areaOfCircle() {
		return radius * radius * MathConstants.PI;
	}
}
