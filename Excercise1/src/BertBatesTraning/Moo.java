package BertBatesTraning;

class Moo extends Zoo {
	public void useMyCoolMethod() {
		// If the preceding line compiles Moo has access
		// to the Zoo class
		// But... does it have access to the coolMethod()?
		System.out.println("Moo says, "+ this.coolMethod());
		// The preceding line works because Moo can access the
		// public method
	}
}
