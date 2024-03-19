/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Date;
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account(int id, double balance, double annual) 
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annual;
        dateCreated = new Date();
    }
    
    public boolean Withdraw(double amount) 
    {
        if (balance > amount) {
            balance -= amount;
            System.out.println("withdraw successful");
            return true;
        }
        System.out.println("withdraw not successful");
        return false;
    }
    
    public void Deposit(double amount) 
    {
        this.balance += amount;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate + 
                ", dateCreated=" + dateCreated.toGMTString() + '}';
    }

    
}
