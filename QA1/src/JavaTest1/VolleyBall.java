package JavaTest1;

public class VolleyBall extends Ball {

	@Override
	public void bounce() {
		System.out.println("Vooley bounc");
		
	}

	@Override
	public void roll() {
		System.out.println("Volley roll");
		
	}

	public VolleyBall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VolleyBall(double bounceFactor, double radius) {
		super(bounceFactor, radius);
		// TODO Auto-generated constructor stub
	}
	

}
