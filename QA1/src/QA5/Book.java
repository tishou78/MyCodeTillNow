package QA5;

public class Book {
	String autohor;
	String name;
	String isdn;
	double price;
	int yearPublished;
	private double VAT = price * 0.2;
	private double promotion = 10 / 100;
	
	
	public Book(String autohor, String name, String isdn, double price, int yearPublished, double vAT) {
		super();
		this.autohor = autohor;
		this.name = name;
		this.isdn = isdn;
		this.price = price;
		this.yearPublished = yearPublished;
		
	}



	double calculatePrice(){
		if(yearPublished > 1990){
			return price + price * VAT;
		}else{
			double priceWithVat = price + price * VAT;
			return priceWithVat - (priceWithVat * promotion);
		}
		
	}

}
