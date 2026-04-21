package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

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


//    public void fileNameFromUser(String initialFile, String writeToFile){
//
//        //we are writing in the following format
//        //id|name|grossPay
//        //111|cameron Tay| 3277.65
//
//        try{
//
//            //opening the file here
//            FileWriter writer = new FileWriter(writeToFile);
//            //Writing to the file
//            writer.write(initialFile);
//
//            writer.close();
//
//        }
//        catch(IOException e){
//            System.out.println("Error: An unexpected error occured");
//            e.printStackTrace();
//        }

//    }

}
