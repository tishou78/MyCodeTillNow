package Zada4a;

public class Bike extends Bicycle {
	protected int gears;
	

	  Bike(double price, int maxSpeed, int gears) {
		super(price, maxSpeed);
		this.gears = gears;
	}


	void makeNoise(){
		
	}


	@Override
	public String toString() {
		return "Bike [gears=" + gears + "]";
	}
	

}
