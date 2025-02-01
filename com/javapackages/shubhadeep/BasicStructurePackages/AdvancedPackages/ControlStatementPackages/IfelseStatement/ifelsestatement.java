package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ControlStatementPackages.IfelseStatement;

import java.util.Scanner;

public class ifelsestatement {
    public static void main(String[] args) {

        // Simple if else statement
        int age = 20;
        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }


        // if else with scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money in your account: ");
        double money = scanner.nextDouble();
        System.out.printf(("You have %.2f in your account\n"), money);
        System.out.println("Enter the amount you want to withdraw: ");
        double withdraw = scanner.nextDouble();
        if (withdraw > money) {
            System.out.println("You don't have enough money in your account");
        } else {
            System.out.println("You have successfully withdrawn " + withdraw + " from your account");
            money -= withdraw;
            System.out.printf("You have %.2f in your account\n", money);
        }



        //If Else without braces 1
        int number = 10;
        if (number > 0)
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");

        //Nested if else
        System.out.println("Enter the amount you want to deposit: ");
        double deposit = scanner.nextDouble();
        if (deposit > 0) {
            money += deposit;
            System.out.printf("You have successfully deposited %.2f. Your new balance is %.2f\n", deposit, money);
            System.out.println("Enter the amount you want to withdraw: ");
            double newWithdraw = scanner.nextDouble();
            if (newWithdraw > money) {
                System.out.println("You don't have enough money in your account");
            } else {
                System.out.println("You have successfully withdrawn " + newWithdraw + " from your account");
                money -= newWithdraw;
                System.out.printf("You have %.2f in your account\n", money);
            }
        } else {
            System.out.println("Invalid deposit amount");
        }


        //If else if ladder
        System.out.println("Enter your age: ");
        int userAge = scanner.nextInt();
        if (userAge < 18) {
            System.out.println("You are a minor");
        } else if (userAge >= 18 && userAge < 60) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }


        //if else with else-if ladder with scanner no braces
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();
        System.out.println("Marks entered: " + marks);
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 80)
            System.out.println("Grade: B");
        else if (marks >= 70)
            System.out.println("Grade: C");
        else if (marks >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");


        // If Else with logical operators
        System.out.println("Enter the purchase price: ");
        double purchasePrice = scanner.nextDouble();
        if (purchasePrice >= 1000 && purchasePrice < 5000) {
            System.out.println("You get a 10% discount");
        } else if (purchasePrice >= 5000 && purchasePrice < 10000) {
            System.out.println("You get a 20% discount");
        } else if (purchasePrice >= 10000) {
            System.out.println("You get a 30% discount");
        } else {
            System.out.println("No discount available");
        }


       // Bank checking system
        final double MIN_BALANCE = 5000.0;
        final double MIN_WITHDRAW = 500.0;
        final double MAX_WITHDRAW = 50000.0;

        System.out.println("Enter the amount you want to deposit: ");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            money += depositAmount;
            System.out.printf("You have successfully deposited %.2f. Your new balance is %.2f\n", depositAmount, money);
        } else {
            System.out.println("Invalid deposit amount");
        }

        System.out.println("Enter the amount you want to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount < MIN_WITHDRAW) {
            System.out.println("The minimum withdrawal limit is " + MIN_WITHDRAW);
        } else if (withdrawAmount > MAX_WITHDRAW) {
            System.out.println("The maximum withdrawal limit is " + MAX_WITHDRAW);
        } else if (withdrawAmount > money) {
            System.out.println("You don't have enough money in your account");
        } else if (money - withdrawAmount < MIN_BALANCE) {
            System.out.println("You must maintain a minimum balance of " + MIN_BALANCE);
        } else {
            money -= withdrawAmount;
            System.out.printf("You have successfully withdrawn %.2f. Your new balance is %.2f\n", withdrawAmount, money);
        }
    }
}
