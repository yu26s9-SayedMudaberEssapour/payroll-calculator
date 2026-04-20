package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payrate;

    //My constructor
    public Employee(int employeeId, String name, double hoursWorked, double payrate){
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payrate = payrate;
    }


    //______________________________________________________________________
    //Getters and setters

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public int getEmployeeId(){
        return employeeId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayrate() {
        return payrate;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }


    //here I will have a method called getGrossPay() that will calculate and return the employee's gross pay based on their hours worked and pay rate

    public double getGrossPay(double hoursWorked, double payrate){
        //I will go through each one of the employees and then multiply the hoursWorked and the payrate


        double result = hoursWorked * payrate;

        return result;
    }

}
