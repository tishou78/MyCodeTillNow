package JavaTest1;

public class PLayground {

	public static void main(String[] args) {
		Ball one = new FootBall();
		one.bounce();
		Ball two = new VolleyBall();
		two.roll();
		two.bounce();
		Ball three = new Baseball();
		three.bounce();
		three.roll();
		three.radius = 2.5;
		System.out.println(three.getRadius());
		one.bounceFactor = 2;
		System.out.println(one.getBounceFactor());

	}

}
