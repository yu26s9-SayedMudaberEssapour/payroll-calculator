package com.pluralsight;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main() throws IOException {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file that you want to read from: ");
        String initial = scanner.nextLine();

        System.out.println("enter the name of the file that you want to write to: ");
        String writeToFile = scanner.nextLine();
        //writing to file

        FileWriter writer = new FileWriter(writeToFile);
        writer.write("id|name|gross pay \n");


        //reading from the file and doing the work
        FileReader fileReader = new FileReader("src/main/java/com/pluralsight/employees.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String singleLine;
        bufferedReader.readLine();



        try{
            while((singleLine = bufferedReader.readLine()) != null){


                //how do I skip the first line
                String[] parts = singleLine.split("\\|"); //in order to check for a bar is to do //| you need the backslashes

                String id = parts[0];
                String name = parts[1];
                String hours_worked = parts[2];
                String pay_rate = parts[3];

                int idVal = Integer.parseInt(id);
                double hours_worked_val = Double.parseDouble(hours_worked);
                double pay_rate_value = Double.parseDouble(pay_rate);

                Employee epm1 = new Employee(idVal, name, hours_worked_val, pay_rate_value);



                String writing =  epm1.getEmployeeId() + "|" + epm1.getName()  + "|" + epm1.getGrossPay(hours_worked_val, pay_rate_value);

                //here we are actually writing to the file
                writer.write(writing + "\n");



            }}


        catch(IOException e){
            System.out.println("Error: An unexpected error occured");
            e.printStackTrace();
        }

        writer.close();



        }

    }

