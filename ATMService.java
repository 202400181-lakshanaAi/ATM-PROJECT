package service;

import model.Account;

public class ATMService {

    private Account account;

    public ATMService(Account account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Amount deposited successfully");
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Please collect your cash");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public Account getAccount() {
        return account;
    }
}
