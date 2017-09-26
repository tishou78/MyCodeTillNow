package QA6example;

public class MediaDemo {
	public static void main(String[] args) {
		Media medi = new VideoMedia();

		Media audi = new AudioMedia();

		medi.play();
		audi.play();
		System.out.println(medi + " " + audi);

	}

}
