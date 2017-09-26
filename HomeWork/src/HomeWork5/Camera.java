package HomeWork5;

public class Camera {
	
	protected String color;
	protected int battery;
	protected boolean hasStabilization;
	protected int maxMemory;
	

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public boolean isHasStabilization() {
		return hasStabilization;
	}

	public void setHasStabilization(boolean hasStabilization) {
		this.hasStabilization = hasStabilization;
	}

	public int getMaxMemory() {
		return maxMemory;
	}

	public void setMaxMemory(int maxMemory) {
		this.maxMemory = maxMemory;
	}



	Camera(){
		battery = 100;
		maxMemory = 10;
	}

	public Camera(String color, int battery, boolean hasStabilization, int maxMemory) {
		super();
		this.color = color;
		this.battery = battery;
		this.hasStabilization = hasStabilization;
		this.maxMemory = maxMemory;
	}
	public void turnOn(){
		System.out.println("The divice is turning ON");
	}
	public void turnOff(){
		System.out.println("The divice is turning Off");
	}
	public void takePhoto(){
		if(maxMemory > 0){
			maxMemory -= 1;
			System.out.println("The picture was taken");
		}else{
			System.out.println("There is no enough space in memory card");
		}

	}

	@Override
	public String toString() {
		return "Camera [color=" + color + ", battery=" + battery + ", hasStabilization=" + hasStabilization
				+ ", maxMemory=" + maxMemory + "]";
	}

}