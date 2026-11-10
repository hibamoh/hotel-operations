package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay () {
        double overtimeHours = getOvertimeHours();
        double regular = getRegularHours();
        double totalPay;
        if (hoursWorked == regular){
            totalPay = (payRate * regular) ;
        }
        else {
            totalPay = (payRate * regular) + (overtimeHours * payRate * 1.5);
        }

        return totalPay;
    }

    public double getRegularHours() {
        double regularHours = 0.0;
        if (hoursWorked <= 40)
            regularHours = getHoursWorked();
        return regularHours;
    }

    public double getOvertimeHours(){
        double overtimeHours = 0.0;
        if ( hoursWorked > 40){
            overtimeHours = (hoursWorked - 40);
        }
        return overtimeHours;
    }

}
