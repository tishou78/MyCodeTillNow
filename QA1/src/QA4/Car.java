package QA4;

import QA3.Person;

public class Car {
	String brand;
	String color;
	boolean isSportCar;
	int doorsCount;
	int maxSpeed;
	int gear;
	Person owner;
	
	
	Car(){
		
	}
	
	Car(String brand,String color,boolean isSportCar){
		this.brand = brand;
		this.color = color;
		this.isSportCar = isSportCar;
	}
	

	public Car(String brand, String color, boolean isSportCar, int doorsCount, int maxSpeed, int gear, Person owner) {
		this(brand,color,isSportCar);

		this.doorsCount = doorsCount;
		this.maxSpeed = maxSpeed;
		this.gear = gear;
		this.owner = owner;
	}
	Car(String brand,int maxSpeed,Person owner){
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", isSportCar=" + isSportCar + ", doorsCount=" + doorsCount
				+ ", maxSpeed=" + maxSpeed + ", gear=" + gear + ", owner=" + owner + "]";
	}

	
	

}
