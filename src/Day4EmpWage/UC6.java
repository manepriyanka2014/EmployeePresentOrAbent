package Day4EmpWage;
import java.util.Random;

public class UC6 
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;
	
	public static void main(String[] args)
	{
		int empHrs = 0;
		int totalEmpHrs =0;
		int totalWorkingDays=0;
		while(totalEmpHrs<= MAX_HRS_IN_MONTH && totalWorkingDays< NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random() *10) % 3;
			switch(empCheck)
			{
				case 1: IS_PART_TIME = 4;
				empHrs=4;
				break;
				case 2: IS_FULL_TIME = 8;
				empHrs=8;
				break;
				default:
				empHrs=0;
			}
			totalEmpHrs +=empHrs;
			System.out.println("Day#: " +totalWorkingDays + "Emp Hr: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage:" + totalEmpWage);			
	}
}


