package com.abc;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) throws IOException {
		Logo l = new Logo();
		l.logo();
		System.out.println("");
		AdminReg reg = new AdminReg(null, null, null, null, null, null, null);
		
		PlanJourney pj = new PlanJourney(null, null, 0);
		Scanner sc = new Scanner(System.in);
		System.out.println("What You Want To Do");
		System.out.println("Press 1 For NEW ADMIN REGISTRATION");
		System.out.println("Press 2 For PLAN JOURNEY");
		int UserInput = sc.nextInt();
		switch (UserInput) {
		case 1:
			reg.AdminUserReg();
			break;
		case 2:
			pj.JourneyDetails();
			break;

		}
		sc.close();

	}

}
