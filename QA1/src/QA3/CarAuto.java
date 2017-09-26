package QA3;

public class CarAuto {
	int currentSpeed;
	int MaxSpeed;
	String color;
	String brand;
	int gear;
	Person owner;
	
	@Override
	public String toString() {
		return "CarAuto [owner = " + owner.name + ", currentSpeed=" + currentSpeed + ", MaxSpeed=" + MaxSpeed + ", color=" + color + ", brand="
				+ brand + ", gear=" + gear + "]";
	}

}
