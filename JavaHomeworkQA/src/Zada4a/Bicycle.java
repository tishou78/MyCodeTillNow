package Zada4a;

public class Bicycle {
	protected double price;
	protected int maxSpeed;
	
	public Bicycle(double price, int maxSpeed){
		this.price = price;
		this.maxSpeed = maxSpeed;
		
	}
	

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	double calculatePrice(){
		return price;
		
	}


	@Override
	public String toString() {
		return "Bicycle [price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}


	

}
