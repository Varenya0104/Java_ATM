package com.sjprogramming;

import java.util.Scanner;

class ATMOperator {
    private static double balance = 1000000; // initial balance

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our ATM!");
        System.out.println("Please select an option:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for using our ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    private static void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount you would like to withdraw: ");
        double amount = input.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("You have withdrawn $" + amount + ".");
            System.out.println("Your new balance is $" + balance + ".");
        }
    }

    private static void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount you would like to deposit: ");
        double amount = input.nextDouble();

        balance += amount;
        System.out.println("You have deposited $" + amount + ".");
        System.out.println("Your new balance is $" + balance + ".");
    }

    private static void checkBalance() {
        System.out.println("Your current balance is $" + balance + ".");
    }
}
