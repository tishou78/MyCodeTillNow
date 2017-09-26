package SomeTraning;

public class PaddingStr {

	public static void main(String[] args) {

		String pader = Main.pad("-", 10);

		String stars = "*";
		while (stars.length() < 10)
			stars += "*";
		System.out.println(stars);
		System.out.println(pader);

	}

	public static class Main {

		public static String pad(final StringBuffer buff, final String string, final int count) {
			for (int i = 0; i < count; i++) {
				buff.append(string);
			}

			return buff.toString();
		}

		public static String pad(final String string, final int count) {
			return pad(new StringBuffer(), string, count);
		}

		public static String pad(final Object obj, final int count) {
			return pad(new StringBuffer(), String.valueOf(obj), count);
		}
	}
}
