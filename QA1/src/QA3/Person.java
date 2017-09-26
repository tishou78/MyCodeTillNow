package QA3;

public class Person {
	String name;
	int age;
	long personalNumber;
	boolean has18;
	double weight;
	Person friend;
	double hasMoney;
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", personalNumber=" + personalNumber + ", has18=" + has18
				+ ", weight=" + weight + ", friend=" + friend + ", hasMoney=" + hasMoney + "]";
	}
	
	
	void eat(){
		System.out.println(name +"  I am eating musaka");
	}
	void walk(){
		System.out.println(name +"  Keep walking");
	}
	void drinkBeer(double beerAmount){
		if(beerAmount < 1.3){
			System.out.println("Gimme more");
		}else{
			System.out.println("I'm happy");
		}
	}
	boolean hasFriend(){
		if(friend != null){
			return true;
					
		}else{
		return false;
		}
		
	}

}
