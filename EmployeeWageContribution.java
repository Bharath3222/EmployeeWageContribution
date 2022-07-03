package org.bridge.git;

import java.util.Random;

public class EmployeeWageContribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random= new Random();
		int empAttendance=random.nextInt(2);
		if(empAttendance==0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Present");
		}
	}

}
