package lesson2;

public class Cube {
	int length;
	int bredth;
	int height;

	Cube() {

		length = 12;
		bredth = 10;
		height = 5;
	}

	public Cube(int length, int bredth, int height) {
		super();
		this.length = length;
		this.bredth = bredth;
		this.height = height;
	}

	public int getCubeVolume() {
		return (length * bredth * height);
	}

	public static void main(String[] args) {
		Cube cube1 = new Cube();
		System.out.println(cube1.getCubeVolume());
		
		Cube cube2 = new Cube(2, 3, 6);
		System.out.println(cube2.getCubeVolume());
	}
}
