package QA6;

public class Cat extends Animal {

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return super.getWeight();
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		super.setWeight(weight);
	}

	@Override
	public void walk() {
		System.out.println("Cat is walking");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("meau");
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}



}
