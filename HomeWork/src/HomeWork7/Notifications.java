package HomeWork7;

import java.util.Scanner;

public class Notifications {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String result = null;
		String operation = null;
		String message = null;
		int code = 0;
		for (int i = 0; i < n; i++) {
			result = sc.nextLine();
			if (result.equals("success")) {
				operation = sc.nextLine();
				message = sc.nextLine();
				ShowSuccess(operation, message);
			} else if (result.equals("error")) {
				operation = sc.nextLine();
				code = sc.nextInt();
				ShowError(operation, code);
			} else {
				continue;
			}
		}
		sc.close();
	}

	static void ShowSuccess(String operation, String message) {

		System.out.printf("Successfully executed %s.\n", operation);
		System.out.printf("==============================\n");
		System.out.printf("Message: %s.\n", message);
	}

	static void ShowError(String operation, int code) {
		String message = null;
		message = code < 0 ? "Internal System Failure" : "Invalid Client Data";

		System.out.printf("Error: Failed to execute %s.\n", operation);
		System.out.printf("==============================\n");
		System.out.printf("Error Code: %d.\n", code);
		System.out.printf("Reason: %s.\n", message);

	}

}
