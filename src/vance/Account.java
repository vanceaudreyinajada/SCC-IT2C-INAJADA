package vance;

import java.util.Scanner;

public class Account {
    Accounts accountManager = new Accounts();

    public void collectAccounts() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of accounts: ");
        int numberOfAccounts = input.nextInt();

        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.print("Enter First Name: ");
            String firstName = input.next();
            System.out.print("Enter Last Name: ");
            String lastName = input.next();
            System.out.print("Enter Email: ");
            String email = input.next();
            System.out.print("Enter Username: ");
            String username = input.next();
            System.out.print("Enter Password: ");
            String password = input.next();

            accountManager.addAccount(firstName, lastName, email, username, password);
        }

        accountManager.displayAccounts();
        input.close();
    }
}
