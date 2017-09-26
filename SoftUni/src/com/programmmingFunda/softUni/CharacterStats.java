package com.programmmingFunda.softUni;

import java.util.Scanner;

public class CharacterStats {
	
	public static String repeatStr(String str,int num){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int healthStat = sc.nextInt();
		int healthRange = sc.nextInt();
		int energyStat = sc.nextInt();
		int energyRange = sc.nextInt();	
		System.out.printf("Name: %s\n", name);
		System.out.printf("Health: |"+ repeatStr("|", healthStat)+ repeatStr(".", healthRange-healthStat)+"|\n");
		System.out.printf("Energy: |"+ repeatStr("|", energyStat)+ repeatStr(".", energyRange-energyStat)+"|\n");
		sc.close();
	}

}
