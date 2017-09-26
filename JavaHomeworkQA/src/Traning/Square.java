package Traning;



public class Square implements Shape {
	private double side1;

	
	public Square(){
		
	}

	public Square(double side1) {
		super();
		this.side1 = side1;
	}

	@Override
	public double area() {
		double area1 = 4 * side1;
		System.out.print("The area is: ");
		return area1;
	}

	@Override
	public double perimeter() {
		double perimeter1 = side1 * side1;
		System.out.print("Perimeter is: ");
		return perimeter1;
	
	}

	
}
