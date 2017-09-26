package QA6;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.age= 5;
		cat.weight = 2.70;
		cat.walk();
		cat.makeSomeNoise();
		System.out.println(cat);
		cat.setWeight(3.50);
		System.out.println(cat.getWeight());
		
	}

}
