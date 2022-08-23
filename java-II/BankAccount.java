/*
 * Filename: WriteRandAccessFile.java
 * Author:   @author Brendan Glancy
 * Date:     @date 08/23/22
 * Purpose:  This class will be used for an example of serialization.
 *
 */

import java.io.*;

public class BankAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private double balance;
    private int accountNumber;
    private static int nextAccountNumber = 1001;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Account Number: " + accountNumber + "\n" + "Balance: " + balance;
    }

}
