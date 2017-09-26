package JavaTest1;

public class FootBall extends Ball {

	@Override
	public void bounce() {
		System.out.println("FootBall bounce");
		
	}

	@Override
	public void roll() {
		System.out.println("FootBall roll");
		
	}

	public FootBall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FootBall(double bounceFactor, double radius) {
		super(bounceFactor, radius);
		// TODO Auto-generated constructor stub
	}
    
}
