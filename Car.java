package cr;

import java.time.Year;

public class Car {
	private String make;
	private String model;
	private int year;
	
	public Car (String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayInfo() {
		System.out.println(year + " " + make + " " + model);
	}
	
	public int getAge() {
		int currentYear = Year.now().getValue();
		return currentYear - year;
	}
	
	public static void main(String[] args) {
		Car c = new Car ("Toyota", "Camry", 2020);
		c.displayInfo();
		System.out.println(c.getAge());
	}

}
