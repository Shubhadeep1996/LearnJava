package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.SwitchStatement.ATMOperation;

import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String accountNumber;
    private String accountType;
    private double balance;
    private String panCardNumber;
    private String insuranceAccountNumber;
    private String insuranceNumber;
    private double insuranceMaturityAmount;

    public Customer(String name, String accountType, double balance) {
        this.name = name;
        this.accountNumber = ATMOperation.generateAccountNumber();
        this.accountType = accountType;
        this.balance = balance;
        this.panCardNumber = ATMOperation.generatePanCardNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public String getInsuranceAccountNumber() {
        return insuranceAccountNumber;
    }

    public void setInsuranceAccountNumber(String insuranceAccountNumber) {
        this.insuranceAccountNumber = insuranceAccountNumber;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public double getInsuranceMaturityAmount() {
        return insuranceMaturityAmount;
    }

    public void setInsuranceMaturityAmount(double insuranceMaturityAmount) {
        this.insuranceMaturityAmount = insuranceMaturityAmount;
    }
}