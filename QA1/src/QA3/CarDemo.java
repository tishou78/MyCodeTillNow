package QA3;

public class CarDemo {
	public static void main(String[] args) {
		CarAuto myBrichka = new CarAuto();
		myBrichka.brand = "Mercedes";
		myBrichka.MaxSpeed = 280;
		myBrichka.currentSpeed = 180;
		myBrichka.gear = 5;
		myBrichka.color = "Gray";
		Person briOwn = new Person();
		briOwn.name = "Tisho";
		briOwn.age = 38;
		myBrichka.owner = briOwn;

		CarAuto ferrary = new CarAuto();
		ferrary.brand = "Ferrary";
		ferrary.MaxSpeed = 320;
		ferrary.currentSpeed = 50;
		ferrary.gear = 2;
		ferrary.color = "red";
		Person ferOwn = new Person();
		ferOwn.name = "Pesho";
		ferOwn.age = 22;
		ferrary.owner = ferOwn;

		System.out.println(myBrichka);
		System.out.println(ferrary);

		myBrichka.currentSpeed -= 50;
		System.out.println(myBrichka);

		ferrary.gear += 1;
		System.out.println(ferrary);

		briOwn.name = "Ilian";
		System.out.println(myBrichka);

	}

}
