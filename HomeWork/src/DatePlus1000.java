import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DatePlus1000 {
	public static void main(String args[]) throws ParseException {

		Scanner sc = new Scanner(System.in);
		String gd = sc.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		Calendar c = Calendar.getInstance();
		c.setTime(dateFormat.parse(gd));
		c.add(Calendar.DATE, 999);
		String nd = dateFormat.format(c.getTime());
		System.out.println(nd);

		sc.close();
	}
}