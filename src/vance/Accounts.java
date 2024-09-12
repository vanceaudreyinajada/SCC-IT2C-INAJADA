package vance;

import java.util.ArrayList;

public class Accounts {
    ArrayList<AccountDetails> accountList = new ArrayList<>();

    public void addAccount(String firstName, String lastName, String email, String username, String password) {
        accountList.add(new AccountDetails(firstName, lastName, email, username, password));
    }

    public void displayAccounts() {

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "ID", "First Name", "Last Name", "Email", "Username", "Password");
        System.out.println("-----------------------------------------------------------------------------------------");

   
        for (AccountDetails account : accountList) {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", 
                    account.accountId, account.firstName, account.lastName, account.email, account.username, account.password);
        }
    }
}

class AccountDetails {
    static int idCounter = 0;
    int accountId;
    String firstName, lastName, email, username, password;

    public AccountDetails(String firstName, String lastName, String email, String username, String password) {
        this.accountId = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
