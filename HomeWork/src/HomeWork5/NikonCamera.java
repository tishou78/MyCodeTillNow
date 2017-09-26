package HomeWork5;

public class NikonCamera extends Camera{

	public void turnOn() {
		System.out.println("Nikon is turning on");
		
	}
	public void turnOff(){
		System.out.println("Nikon is turning off");
	}
	

	@Override
	public void takePhoto() {
		super.takePhoto();
		System.out.println("by Nikon");
	}
	
	

}
