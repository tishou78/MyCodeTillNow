package Zada4a;

public class BikeDemo {
	public static void main(String[] args) {
		Bicycle bicycle = new TrackBike(203.5, 40, 23, true);
		((Bike) bicycle).makeNoise();
		bicycle.setPrice(230);
		bicycle.setMaxSpeed(36);
		if (bicycle instanceof Bike)
			System.out.println("yes, bicycle instanceof Bike");
		System.out.println(bicycle);
	}

}
