package JavaTest1;

public class Baseball extends Ball {

	@Override
	public void bounce() {
		System.out.println("BaseBall bounce");
		
	}

	@Override
	public void roll() {
		System.out.println("BaseBall roll");
		
	}

	public Baseball() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Baseball(double bounceFactor, double radius) {
		super(bounceFactor, radius);
		// TODO Auto-generated constructor stub
	}
    
}
