package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PayrollCalculator {
    public static void main() throws IOException {

        FileReader fileReader = new FileReader("src/main/java/com/pluralsight/employees.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        String singleLine;

        bufferedReader.readLine();

        while((singleLine = bufferedReader.readLine()) != null){


            //how do I skip the first line
            String[] parts = singleLine.split("\\|");

            String id = parts[0];
            String name = parts[1];
            String hours_worked = parts[2];
            String pay_rate = parts[3];

            int idVal = Integer.parseInt(id);
            double hours_worked_val = Double.parseDouble(hours_worked);
            double pay_rate_value = Double.parseDouble(pay_rate);

            Employee epm1 = new Employee(idVal, name, hours_worked_val, pay_rate_value);

            System.out.println("Your name is "+ epm1.getName());
            System.out.println("your employee id is: " + epm1.getEmployeeId());
            System.out.println("Your gross pay is: $" + epm1.getGrossPay(hours_worked_val, pay_rate_value));
            System.out.println();



        }




    }
}
