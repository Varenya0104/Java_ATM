package com.sjprogramming;

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public ATM(){

    }

    //getter and setter

    public double getBalance() {
        return balance;
    }

    public void setBalance(double v) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}

