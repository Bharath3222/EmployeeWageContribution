package org.bridge.git;

import java.util.Random;

public class EmployeeWageContribution {
	public static void main(String[] args) {
		
		final int WAGE_PER_HOUR = 20;	
		final int workingDays=20;
int totalSalary = 0;
Random random= new Random();
		
		for (int day=0;day<=workingDays;day++) {
			int isEmpPresent = random.nextInt(3);
		int empHR;
		switch(isEmpPresent) {
			
		case 1 :
			//System.out.println("Employee is present");
			empHR = 8;	
		break;
	
		case 2 :
			//System.out.println("Employee is working part-time");
			empHR = 4;
		break;
		
		default :
			//System.out.println("Employee is absent");
			empHR = 0;
		break;
		}
		
		int empWage = empHR * WAGE_PER_HOUR;
		totalSalary = totalSalary + empWage;
		}
		System.out.println("Employee monthly  Wage is : "+totalSalary);
	}

}
