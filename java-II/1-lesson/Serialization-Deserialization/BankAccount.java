/*
 * Filename: WriteRandAccessFile.java
 * Author:   @author Brendan Glancy
 * Date:     @date 08/23/22
 * Purpose:  This class will be used for an example of serialization.
 *
 */

import java.io.*;

public class BankAccount implements Serializable {
    private double balance;

    // no arg constructor
    public BankAccount() {
        balance = 0.0;
    }

    public BankAccount(double startBalance) {
        balance = startBalance;
    }

    public BankAccount(String str) {
        balance = Double.parseDouble(str);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(String str) {
        balance += Double.parseDouble(str);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void withdraw(String str) {
        balance -= Double.parseDouble(str);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBalance(String str) {
        balance = Double.parseDouble(str);
    }
}
