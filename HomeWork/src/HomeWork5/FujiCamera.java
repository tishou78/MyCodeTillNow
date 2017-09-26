package HomeWork5;

public class FujiCamera extends Camera{
	
	

	
	public void turnOn() {
		System.out.println("Fuji turning onn");
	}

	
	public void turnOff() {
		System.out.println("Fuji turning off");
	}

	@Override
	public void takePhoto() {
		
		super.takePhoto();
		System.out.println("by Fuji");
	}
	
	

}
