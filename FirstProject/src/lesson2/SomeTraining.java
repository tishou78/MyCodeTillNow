package lesson2;

import java.util.Scanner;

public class SomeTraining {

			public static void main(String[] args) {
		
				System.out.println("Enter number for month");
				Scanner scan = new Scanner(System.in);
				int monthNumber = scan.nextInt();
				
				String monthAsText;
				
				switch(monthNumber){
				case 1: monthAsText = "January";
						break;
				case 2: monthAsText = "February";
						break;
				case 3: monthAsText = "March";
						break;
				case 4: monthAsText = "April";
						break;
				case 5: monthAsText = "May";
						break;
				case 6: monthAsText = "June";
						break;
				case 7: monthAsText = "july";
				        break;
		        case 8: monthAsText = "august";
				        break;
		        case 9: monthAsText = "september";
				        break;
		        case 10: monthAsText = "october";
				        break;
		        case 11: monthAsText = "november";
				        break;
		        case 12: monthAsText = "december";
				        break;
				default: monthAsText = "Invalid comand";
						break;		
				}
				
				System.out.println("The month you chose is: " + monthAsText +".");
				scan.close();
			}
		}