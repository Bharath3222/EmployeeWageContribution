package org.bridge.git;

import java.util.Random;

public class EmployeeWageContribution {
	public static void main(String[] args) {
		

	final int WAGE_PER_HOUR = 20;	
	Random random= new Random();
	int isEmpPresent = random.nextInt(2);
	int empHR;
	if (isEmpPresent == 1) {
		System.out.println("Employee is present");
		empHR = 8;
	} else {
		System.out.println("Employee is absent");
		empHR = 0;
	}
	int empWage = empHR * WAGE_PER_HOUR;
	System.out.println("Employee Wage is : "+empWage);
	}

}
