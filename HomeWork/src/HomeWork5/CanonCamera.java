package HomeWork5;

public class CanonCamera extends Camera{
	

	
	public void turnOn() {
		System.out.println("Turning on with Canon");
		
	}

	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("by Canon");
	}

	@Override
	public void takePhoto() {
		
		super.takePhoto();
		System.out.println("by Canon");
	}
	

}
