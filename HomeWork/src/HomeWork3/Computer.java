package HomeWork3;

public class Computer {
	short year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operatingSystem;
	
	Computer(){
		isNotebook = false;
		operatingSystem = "Win XP";
				
	}
	Computer(int year, double price, double hardDiskMemory, double freeMemory ){
		
	}
	Computer(int	year,	double	price,	boolean	isNotebook, double	hardDiskMemory,	
			double	freeMemory,	String	operationSystem){
		this(year,price,hardDiskMemory,freeMemory);
		this.isNotebook = isNotebook;
		this.operatingSystem = operationSystem;
	}
	int comperPrice(Computer c){
		if(price > c.price){
			return -1;
		}
		if(price < c.price){
			return 1;
		}else{
			return 0;
		}
	}

	
	void changeOperationSystem(String newOperationSystem){
		operatingSystem = newOperationSystem;
	}
	void useMemory(double memory){
		if(freeMemory - memory < 0){
			System.out.println("Not enough free memory!");
		}else{
			freeMemory -= memory;
		}
		
	}
	@Override
	public String toString() {
		return "Computer [year=" + year + ", price=" + price + ", isNotebook=" + isNotebook + ", hardDiskMemory="
				+ hardDiskMemory + ", freeMemory=" + freeMemory + ", operatingSystem=" + operatingSystem + "]";
	}
	
	

}
