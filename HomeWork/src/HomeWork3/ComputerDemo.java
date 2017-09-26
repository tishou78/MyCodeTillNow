package HomeWork3;

public class ComputerDemo {
	public static void main(String[] args) {
		Computer myHP = new Computer();
		myHP.year = 2015;
		myHP.price = 1200;
		
		myHP.hardDiskMemory = 1000;
		myHP.freeMemory = 800;
		myHP.operatingSystem = "Windows10";
		
		Computer myLap = new Computer();
		myLap.year = 2014;
		myLap.price = 890;
		myLap.isNotebook = true;
		myLap.hardDiskMemory = 750;
		myLap.freeMemory = 550;
		myLap.operatingSystem = "linux";
		
		Computer myAsus = new Computer();
		myAsus.year = 2013;
		myAsus.price = 900.99;
		myAsus.hardDiskMemory = 500;
		myAsus.freeMemory = 400;
		
		
		Computer myDell = new Computer();
		myDell.year = 2012;
		myDell.price = 1200;
		
		
		
		myHP.useMemory(100);
		myLap.changeOperationSystem("Window8.1");
		
		System.out.println(myDell);
		System.out.println(myLap);
		int result = myLap.comperPrice(myDell);
		
		
		
		
		
		switch(result){
		case -1: 
			System.out.println("myLap is more expansive than myDell");
			break;
		case 1:
			System.out.println("myLap is cheaper than myDell");
			break;
		case 0:
			System.out.println("The computers have equel price");
			break;
		default:
			System.out.println("error");
			break;
		}
	}

}
