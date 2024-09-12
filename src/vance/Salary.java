package vance;


import java.util.Scanner;

public class Salary {
    public void gatherSalaries() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Employees: ");
        int numEmployees = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            System.out.print("Enter your name: ");
            String employeeName = input.nextLine();
            System.out.print("Enter age: ");
            int employeeAge = input.nextInt();
            System.out.print("Enter hourly rate: ");
            double hourlyRate = input.nextDouble();
            System.out.print("Enter total hours worked: ");
            double totalHoursWorked = input.nextDouble();
            System.out.print("Enter total deductions: ");
            double totalDeductions = input.nextDouble();
            input.nextLine(); 

            Salaries salaryDetails = new Salaries();
            salaryDetails.setDetails(employeeName, employeeAge, hourlyRate, totalHoursWorked, totalDeductions);
        }

        
        Salaries.displayTable();
        
        Salaries.displayTotals();
        input.close();
    }
}

