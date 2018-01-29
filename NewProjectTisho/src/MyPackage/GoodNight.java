package MyPackage;

public class GoodNight {
	public static void main(String[] args) {

		TestInterruptingThread tr = new TestInterruptingThread();
		tr.start();

		tr.interrupt();
	}
}

class TestInterruptingThread extends Thread {
	public void run() {
		System.out.println("Excuse me while I nap ");
		System.out.println("for just five seconds...");

		try {
			takeANap();

		} catch (InterruptedException e) {
			System.out.println("Hey, who woke me up?");
		} catch (ArithmeticException e) {
			System.out.println("this is arithmetic exception");
		}
		System.out.println("Ah, that was refreshing");
	}

	private static void takeANap() throws InterruptedException {
		Thread.sleep(5000);
		
	}
}
