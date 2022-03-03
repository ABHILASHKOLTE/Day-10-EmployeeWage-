package com.bridgelabszzUC12;

public interface EmployeeWage {
    //Constants for class
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    //Methods for Calculating Employee Wages
    public void calculateEmpWage();
    public int calculateEmpWage(CompanyEmpWage companyEmpWage);
}