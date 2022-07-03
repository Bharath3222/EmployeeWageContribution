package org.bridge.git;

import java.util.Random;

public class EmployeeWageContribution {
	public static void main(String[] args) {
		int wagePerHour = 20;
		int workingHours = 0;
		int day = 1;
		int totalWorkingHours = 0;
		int maxDaysInMonth = 20;
		int maxHrsinMonth = 100;
		int totalSalary = 0;
		final int fullTime = 1;
		final int partTime = 2;
		final int absent = 0;
		Random random = new Random();
		int empCheck = random.nextInt(3);

		while (day <= maxDaysInMonth && totalWorkingHours <= maxHrsinMonth) {
			switch (empCheck) {
			case absent:
				workingHours = 0;
				break;
			case fullTime:
				workingHours = 8;
				break;
			case partTime:
				workingHours = 4;
				break;
			default:
				break;
			}
			totalWorkingHours += workingHours;
			if (totalWorkingHours >= maxHrsinMonth) {
				totalWorkingHours -= workingHours;
				break;
			}
			int salary = wagePerHour * workingHours;
			totalSalary += salary;
			day++;

		}
		System.out.println(
				"employee has earned " + totalSalary + " in a month (total working hours " + totalWorkingHours + ")");
	}

}
