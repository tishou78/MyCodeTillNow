package Zada4a;

public class TrackBike extends Bike{
	boolean hasTractionControl;
	
	public TrackBike(double price, int maxSpeed, int gears, boolean hasTractionControl) {
		super(price, maxSpeed, gears);
		this.hasTractionControl = hasTractionControl;
	}

	@Override
	public String toString() {
		return "TrackBike [hasTractionControl=" + hasTractionControl + "]";
	}

	void makeNoiseAsATrackBike(){
		System.out.println("brym brym");
	}



	

}
