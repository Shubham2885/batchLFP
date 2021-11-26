package batchlft86.batchlft86;

import java.util.Scanner;

public class ClassDemo {

	public static void main(String[] args) {
		//LHS => variable creation part
		//RHS => Object creation part => reference
		//new => is using for to assign the memory to object
		// Vehical() => creation of object => it call the default constuctor of class
		System.out.println(new Vehical());
		Vehical car = new Vehical();
		
		car.driving();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value for name : ");
		String name = scanner.next();
		System.out.println("Enter the nubmer of geer");
		int geer = scanner.nextInt();
		
		Vehical truck = new Vehical();
		truck.setName(name);
		truck.setNumberOfGeer(geer);
		System.out.println(truck);
	}
}
