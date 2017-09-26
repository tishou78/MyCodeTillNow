package QA6;

public abstract class Animal {
	protected int age;
	protected double weight;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void walk(){
		System.out.println("animal is walking");
	}
	public abstract void makeSomeNoise();
	@Override
	public String toString() {
		return "Animal [age=" + age + ", weight=" + weight + "]";
	}
	
	

}
