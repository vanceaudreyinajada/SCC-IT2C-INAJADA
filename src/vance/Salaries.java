package vance;


import java.util.ArrayList;

public class Salaries {
    String employeeName;
    int employeeAge;
    double hourlyRate;
    double totalHoursWorked;
    double totalDeductions;
    
    static double totalGrossPay = 0;
    static double totalDeductionsSum = 0;
    static double totalNetPay = 0;
    
    static ArrayList<Salaries> employeeList = new ArrayList<>();

    public void setDetails(String name, int age, double rate, double hours, double deductions) {
        this.employeeName = name;
        this.employeeAge = age;
        this.hourlyRate = rate;
        this.totalHoursWorked = hours;
        this.totalDeductions = deductions;
        
        double grossPay = rate * hours;
        double netPay = grossPay - deductions;

        totalGrossPay += grossPay;
        totalDeductionsSum += deductions;
        totalNetPay += netPay;

        employeeList.add(this);
    }

    public void displaySalarySlip() {
        double grossPay = hourlyRate * totalHoursWorked;
        double netPay = grossPay - totalDeductions;

        System.out.printf("%-20s %-5d %-10.2f %-15.2f %-10.2f %-10.2f\n", 
                          employeeName, employeeAge, hourlyRate, totalHoursWorked, totalDeductions, netPay);
    }

    public static void displayTable() {
        System.out.printf("%-20s %-5s %-10s %-15s %-10s %-10s\n", 
                          "Name", "Age", "Rate", "Hours Worked", "Deductions", "Net Pay");
        System.out.println("---------------------------------------------------------------");
        for (Salaries emp : employeeList) {
            emp.displaySalarySlip();
        }
    }

    public static void displayTotals() {
        System.out.printf("\nTotal Salary Request: %.2f\n", totalGrossPay);
        System.out.printf("Total Deduction: %.2f\n", totalDeductionsSum);
        System.out.printf("Total Salary to Release: %.2f\n", totalNetPay);
    }
}
