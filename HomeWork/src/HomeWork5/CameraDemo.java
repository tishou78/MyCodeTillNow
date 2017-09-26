package HomeWork5;


public class CameraDemo{
	public static void main(String[] args) {
		CanonCamera camer = new CanonCamera();
		camer.takePhoto();
		System.out.println(camer);
		
		FujiCamera fuji = new FujiCamera();
		fuji.color = "blue";
		fuji.hasStabilization = true;
		
		
		NikonCamera niko = new NikonCamera();
		niko.turnOn();
		System.out.println(niko);
		niko.takePhoto();
		System.out.println(niko);
		
		camer.setColor("red");
		System.out.println(camer);
		System.out.println(niko);
		System.out.println(fuji);

		
		
	}
}
