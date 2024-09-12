
package vance;



import java.text.NumberFormat;
import java.util.Scanner;

public class NetPay {
   
    public void getPay() {
        Scanner input = new Scanner(System.in);
       
        String name;
        int age;
        double rate, hours, deduct;
       
        System.out.print("Enter your name: ");
        name = input.nextLine();
       
        System.out.print("Enter age: ");
        age = input.nextInt();
       
        System.out.print("Enter rate: ");
        rate = input.nextDouble();
       
        System.out.print("Enter hours: ");
        hours = input.nextDouble();
       
        System.out.print("Enter Total Deduct: ");
        deduct = input.nextDouble();
       
        System.out.println("------------------------");
        System.out.println("SLIP DETAILS");
        System.out.println("------------------------");
       
        System.out.println("DATE: AUGUST 14, 2024");
        System.out.println(name);
        System.out.println("AGE: " + age);
       
        System.out.println("Total Gross: " + (rate * hours));
        System.out.println("Total Deductions: " + deduct);
       
        System.out.println("-----------------------------------");
        System.out.println("Net Pay: " + (rate * hours - deduct));
        System.out.println("-----------------------------------");
       
        double money = 19500.0;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(money);
        System.out.println("Formatted Amount: " + moneyString);
    }
}