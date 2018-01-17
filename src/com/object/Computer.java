package com.object;

import java.util.Scanner;

public class Computer {

	Scanner in = new Scanner(System.in);

	public void processorIs(String processor) {
		System.out.println("Processor: " + processor);
	}

	public void ramIs(int ram) {
		System.out.println("RAM: " + ram + " GBytes");
	}

	public void hddIs(int hdd) {
		System.out.println("HDD: " + hdd + " GBytes");
	}

	public void monitorIs(int monitor) {
		System.out.println("Monitor size: " + monitor + "'");
	}

	private String run() {
		return "Loading...";
	}

	// Method of Password checking
	public String PasswordCheck() {
		String MyPassword = "iibt-2017";
		String passwordCheckingResult = "";
		int numberOfAllowedAttepts = 3;

		for (int i = 1; i <= numberOfAllowedAttepts; i++) { // Number of attempts
			System.out.println("Enter your password:");
			String password = in.nextLine();
			if (password.equals(MyPassword)) {
				passwordCheckingResult = "Password is OK. " + run();
				break;
			} else {
				int attemptsLeft = numberOfAllowedAttepts - i;
				if (attemptsLeft == 0) {
					passwordCheckingResult = "You entered incorrect password three times. HASTA LA VISTA, BABY!!!";
					break;
				} else {
					passwordCheckingResult = "Password is incorrect. " + attemptsLeft + " attempts left";
					System.out.println(passwordCheckingResult);
				}
			}
		}
		return passwordCheckingResult;
	}

}
