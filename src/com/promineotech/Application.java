package com.promineotech;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean loggedIn = false;
		
		Scanner sc = new Scanner(System.in);
		int loginAttempts = 0;
		int maxLoginAttempts = 3;
		while (!loggedIn) {
			System.out.print("Enter username: ");
			String username = sc.nextLine();
			System.out.print("Enter password: ");
			String password = sc.nextLine();
			if (username.equals("mike123")&& password.equals("123")) {
				System.out.println("Welcome back " + username);
				loggedIn = true;
			} else {
				loginAttempts++;
				System.out.println("Inacurate credentials!  You Have " + (maxLoginAttempts - loginAttempts) + " attempts left.");
				if (loginAttempts == maxLoginAttempts) {
					System.out.println("You are locked out! Please contact Admin for further assistance");
				}
				
			} 
			
		}
	}
}