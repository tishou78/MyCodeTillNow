package QA6example;

public class AudioMedia implements Media {

	@Override
	public
	void play() {
		System.out.println("The audio is runing");
	}

	@Override
	public
	void stop() {
		System.out.println("The audio was stoped");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
