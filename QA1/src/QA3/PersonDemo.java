package QA3;

public class PersonDemo {
	public static void main(String[] args) {
		Person ivan = new Person();
		ivan.name = "Ivan Samorano";
		ivan.age = 33;
		ivan.has18 = true;
		ivan.personalNumber = 1234;
		ivan.weight = 78.99;
		
		
		Person paola = new Person();
		paola.name = "Paola Stoyanova Elieva";
		paola.age = 14;
		paola.has18 = false;
		paola.personalNumber = 1325;
		paola.weight = 50.48;
		
		System.out.println(ivan.toString());
		System.out.println(paola.toString());
		
		ivan.friend = paola;
		System.out.println(ivan);
		ivan.walk();
		paola.eat();
		paola.drinkBeer(0.7);
		boolean hasIvanFriend = ivan.hasFriend();
		System.out.println("has" + ivan.friend);
	}

}
