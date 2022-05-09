package com.bridgelabz.day9;

public class EmployeeWage {
    final static int FULL_TIME=2; //Assigned full time with 2
    final static int PART_TIME=1; //Assigned part time with 1
    static int dailyWage=0;	 //Store dailyWage of employee
    static int workHours=0;  //Store work hour of employee
    static int totalWorkingDays=1; //Store total working days of an employee in month
    static int totalWages=0; //Store total wages in a month
    static int totalWorkingHrs=0; //Store total working hours of an employee in month
    static String company=""; //Store Company name

    //Computes Total Wages  of an Employee in month
    public static int ComputeWage(int wage_per_hour, int working_days, int working_hours, String company) {

        EmployeeWage.company=company;

        //Continues till totalWorkings days reached maximum working days
        while(totalWorkingDays<=working_days || totalWorkingHrs<=working_days) {
            int attendence = (int)(Math.random()*3); // Generates 0 or 1 using random() and stores the value

			/*Checks if Employee is working full time,part time or absent and store work hours and calculate daily wage of employee
				according to work time*/
            switch(attendence) {
                case FULL_TIME: workHours=8;
                    break;

                case PART_TIME: workHours=4;
                    break;

                default:		workHours=0;

            }
            dailyWage=workHours*wage_per_hour; //Calculates daily wages
            totalWorkingHrs+=workHours; //Increments by workHours
            System.out.println("Daily Wage of an Employee on Day "+totalWorkingDays+" is "+dailyWage);
            totalWorkingDays++;
        }
        return totalWorkingHrs*wage_per_hour; //Calculates and returns total wages in month
    }

    public static void main(String[] args) {

        //Calls class method computeWage with different parameters and assigns return value to totalWages
        totalWages=EmployeeWage.ComputeWage(20, 3, 10, "OnePlus");
        System.out.println("Total wages of Employee in "+EmployeeWage.company+" Company ="+totalWages);

        totalWages=EmployeeWage.ComputeWage(20, 20, 100, "Google");
        System.out.println("Total wages of Employee in "+EmployeeWage.company+" Company ="+totalWages);

    }

}