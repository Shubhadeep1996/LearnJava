package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ControlStatementPackages.SwitchStatement.ATMOperation;

import java.io.*;
import java.util.*;

public class ATMOperation {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Customer> customerDatabase = new HashMap<>();
    private static Random random = new Random();
    private static final String DATABASE_FILE = "customerDatabase.dat";

    public static void main(String[] args) {
        loadCustomerData();

        while (true) {
            System.out.println("Who are you? (Administrator/Bank Manager/Customer) or type 'exit' to quit:");
            String role = scanner.nextLine();

            if (role.equalsIgnoreCase("exit")) {
                saveCustomerData();
                System.out.println("Exiting the system. Goodbye!");
                break;
            }

            switch (role) {
                case "Administrator":
                    handleAdministrator();
                    break;
                case "Bank Manager":
                    handleManager();
                    break;
                case "Customer":
                    handleCustomer();
                    break;
                default:
                    System.out.println("Invalid role.");
            }
        }
    }

    private static void saveCustomerData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATABASE_FILE))) {
            oos.writeObject(customerDatabase);
            System.out.println("Customer data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving customer data: " + e.getMessage());
        }
    }

    private static void loadCustomerData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATABASE_FILE))) {
            customerDatabase = (Map<String, Customer>) ois.readObject();
            System.out.println("Customer data loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Database file not found. Starting with an empty database.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading customer data: " + e.getMessage());
        }
    }

    private static void handleAdministrator() {
        System.out.println("Administrator Mode");
        System.out.println("1. Edit customer insurance status");
        System.out.println("2. Edit customer account status");
        System.out.println("3. Add insurance details");
        System.out.println("4. Remove insurance details");
        System.out.println("5. Approve insurance details");
        System.out.println("6. View insurance details");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                editCustomerInsuranceStatus();
                break;
            case 2:
                editCustomerAccountStatus();
                break;
            case 3:
                addInsuranceDetails();
                break;
            case 4:
                removeInsuranceDetails();
                break;
            case 5:
                approveInsuranceDetails();
                break;
            case 6:
                viewInsuranceDetails();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void handleManager() {
        System.out.println("Bank or Branch Manager Mode");
        System.out.println("1. Edit customer details");
        System.out.println("2. View specific customer details");
        System.out.println("3. Add new customer");
        System.out.println("4. Add insurance details");
        System.out.println("5. Remove insurance details");
        System.out.println("6. Approve insurance details");
        System.out.println("7. View insurance details");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                editCustomerDetails();
                break;
            case 2:
                viewSpecificCustomerDetails();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                addInsuranceDetails();
                break;
            case 5:
                removeInsuranceDetails();
                break;
            case 6:
                approveInsuranceDetails();
                break;
            case 7:
                viewInsuranceDetails();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void handleCustomer() {
        System.out.println("Enter your account number or name if you forgot your account number:");
        String input = scanner.nextLine();
        Customer customer = getCustomer(input);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Customer Mode");
        System.out.println("1. View account details");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Apply for insurance");
        System.out.println("5. Calculate insurance premium");
        System.out.println("6. View insurance details");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                viewAccountDetails(customer);
                break;
            case 2:
                withdraw(customer);
                break;
            case 3:
                deposit(customer);
                break;
            case 4:
                applyForInsurance(customer);
                break;
            case 5:
                calculateInsurancePremium(customer);
                break;
            case 6:
                viewInsuranceDetails(customer);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static Customer getCustomer(String input) {
        for (Customer customer : customerDatabase.values()) {
            if (customer.getAccountNumber().equals(input) || customer.getName().equalsIgnoreCase(input)) {
                return customer;
            }
        }
        return null;
    }

    private static void editCustomerInsuranceStatus() {
        System.out.println("Enter customer account number:");
        String accountNumber = scanner.nextLine();
        Customer customer = getCustomer(accountNumber);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Current insurance status: " + (customer.getInsuranceAccountNumber() != null ? "Open" : "Closed"));
        System.out.println("Enter new insurance status (Open/Close):");
        String status = scanner.nextLine();

        if (status.equalsIgnoreCase("Open")) {
            customer.setInsuranceAccountNumber(generateInsuranceAccountNumber());
            customer.setInsuranceNumber(generateInsuranceNumber());
            System.out.println("Insurance opened for customer.");
        } else if (status.equalsIgnoreCase("Close")) {
            customer.setInsuranceAccountNumber(null);
            customer.setInsuranceNumber(null);
            System.out.println("Insurance closed for customer.");
        } else {
            System.out.println("Invalid status.");
        }
    }

    private static void editCustomerAccountStatus() {
        System.out.println("Enter customer account number:");
        String accountNumber = scanner.nextLine();
        Customer customer = getCustomer(accountNumber);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Current account status: " + (customer.getBalance() >= 200 ? "Open" : "Closed"));
        System.out.println("Enter new account status (Open/Close):");
        String status = scanner.nextLine();

        if (status.equalsIgnoreCase("Open")) {
            customer.setBalance(200); // setting minimum balance to open account
            System.out.println("Account opened for customer.");
        } else if (status.equalsIgnoreCase("Close")) {
            customer.setBalance(0);
            System.out.println("Account closed for customer.");
        } else {
            System.out.println("Invalid status.");
        }
    }

    private static void editCustomerDetails() {
        System.out.println("Enter customer account number:");
        String accountNumber = scanner.nextLine();
        Customer customer = getCustomer(accountNumber);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Editing details for customer: " + customer.getName());
        System.out.println("Enter new name:");
        customer.setName(scanner.nextLine());
        System.out.println("Enter new account type (Regular/Premium/Priority):");
        String newAccountType = scanner.nextLine();
        customer.setAccountType(newAccountType);
        System.out.println("Enter new balance:");
        customer.setBalance(scanner.nextDouble());
        scanner.nextLine(); // consume newline

        if (customer.getInsuranceAccountNumber() != null) {
            System.out.println("Current insurance details:");
            System.out.println("Insurance Account Number: " + customer.getInsuranceAccountNumber());
            System.out.println("Insurance Number: " + customer.getInsuranceNumber());
            System.out.println("Insurance Maturity Amount: " + customer.getInsuranceMaturityAmount());

            System.out.println("Do you want to edit insurance details? (yes/no):");
            String editInsurance = scanner.nextLine();

            if (editInsurance.equalsIgnoreCase("yes")) {
                System.out.println("Enter new insurance amount:");
                double newInsuranceAmount = scanner.nextDouble();
                scanner.nextLine(); // consume newline

                double returnRate = 1.0;
                if (newAccountType.equalsIgnoreCase("Priority")) {
                    returnRate += 0.05; // additional 5% for self-approval
                }

                System.out.println("Insurance Tenure Options:");
                System.out.println("1. 1 Year - 5% return");
                System.out.println("2. 1 Year and 8 Months - 8% return");
                System.out.println("3. 2 Years and 6 Months - 14% return");
                System.out.println("4. 5 Years - 25% return");
                System.out.println("5. 10 Years - 35% return");
                System.out.println("Enter your choice:");
                int tenureChoice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (tenureChoice) {
                    case 1:
                        returnRate += 0.05;
                        break;
                    case 2:
                        returnRate += 0.08;
                        break;
                    case 3:
                        returnRate += 0.14;
                        break;
                    case 4:
                        returnRate += 0.25;
                        break;
                    case 5:
                        returnRate += 0.35;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }

                customer.setInsuranceMaturityAmount(newInsuranceAmount * returnRate);
                System.out.println("Insurance details updated.");
            }
        }

        System.out.println("Customer details updated.");
    }

    private static void viewSpecificCustomerDetails() {
        System.out.println("Enter customer account number:");
        String accountNumber = scanner.nextLine();
        Customer customer = getCustomer(accountNumber);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Customer details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Account Type: " + customer.getAccountType());
        System.out.println("Balance: " + customer.getBalance());
        System.out.println("PAN Card Number: " + customer.getPanCardNumber());
        System.out.println("Insurance Account Number: " + customer.getInsuranceAccountNumber());
        System.out.println("Insurance Number: " + customer.getInsuranceNumber());
        System.out.println("Insurance Maturity Amount: " + customer.getInsuranceMaturityAmount());
    }

    private static void addNewCustomer() {
        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        System.out.println("Enter account type (Regular/Premium/Priority):");
        String accountType = scanner.nextLine();
        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Customer customer = new Customer(name, accountType, balance);
        customerDatabase.put(customer.getAccountNumber(), customer);
        System.out.println("New customer added with account number: " + customer.getAccountNumber());
    }

    private static void viewAccountDetails(Customer customer) {
        System.out.println("Account details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Account Type: " + customer.getAccountType());
        System.out.println("Balance: " + customer.getBalance());
        System.out.println("PAN Card Number: " + customer.getPanCardNumber());
        System.out.println("Insurance Account Number: " + customer.getInsuranceAccountNumber());
        System.out.println("Insurance Number: " + customer.getInsuranceNumber());
        System.out.println("Insurance Maturity Amount: " + customer.getInsuranceMaturityAmount());
    }

    private static void withdraw(Customer customer) {
        System.out.println("Enter amount to withdraw:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        if (customer.getBalance() >= amount) {
            customer.setBalance(customer.getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + customer.getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private static void deposit(Customer customer) {
        System.out.println("Enter amount to deposit:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        customer.setBalance(customer.getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + customer.getBalance());
    }

    private static void applyForInsurance(Customer customer) {
        if (customer.getAccountType().equalsIgnoreCase("Priority")) {
            System.out.println("Insurance Tenure Options:");
            System.out.println("1. 1 Year - 5% return");
            System.out.println("2. 1 Year and 8 Months - 8% return");
            System.out.println("3. 2 Years and 6 Months - 14% return");
            System.out.println("4. 5 Years - 25% return");
            System.out.println("5. 10 Years - 35% return");
            System.out.println("Enter your choice:");
            int tenureChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            double returnRate;
            switch (tenureChoice) {
                case 1:
                    returnRate = 1.05;
                    break;
                case 2:
                    returnRate = 1.08;
                    break;
                case 3:
                    returnRate = 1.14;
                    break;
                case 4:
                    returnRate = 1.25;
                    break;
                case 5:
                    returnRate = 1.35;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }

            System.out.println("Enter insurance amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            if (customer.getBalance() >= amount) {
                customer.setInsuranceAccountNumber(generateInsuranceAccountNumber());
                customer.setInsuranceNumber(generateInsuranceNumber());
                customer.setInsuranceMaturityAmount(amount * returnRate);
                customer.setBalance(customer.getBalance() - amount);
                System.out.println("Insurance applied successfully. New balance: " + customer.getBalance());
            } else {
                System.out.println("Insufficient balance for insurance.");
            }
        } else {
            System.out.println("Only Priority customers can apply for insurance directly.");
        }
    }

    private static void addInsuranceDetails() {
        System.out.println("Enter customer account number:");
        String accountNumber = scanner.nextLine();
        Customer customer = getCustomer(accountNumber);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Enter insurance amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        if (customer.getBalance() >= amount) {
            customer.setInsuranceAccountNumber(generateInsuranceAccountNumber());
            customer.setInsuranceNumber(generateInsuranceNumber());
            customer.setInsuranceMaturityAmount(amount * 1.3); // assuming 30% return for 10 years
            customer.setBalance(customer.getBalance() - amount);
            System.out.println("Insurance details added successfully. New balance: " + customer.getBalance());
        } else {
            System.out.println("Insufficient balance for insurance.");
        }
    }

    private static void removeInsuranceDetails() {
        System.out.println("Enter customer account number:");
        String accountNumber = scanner.nextLine();
        Customer customer = getCustomer(accountNumber);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        customer.setInsuranceAccountNumber(null);
        customer.setInsuranceNumber(null);
        customer.setInsuranceMaturityAmount(0);
        System.out.println("Insurance details removed successfully.");
    }

    private static void approveInsuranceDetails() {
        System.out.println("Enter customer account number:");
        String accountNumber = scanner.nextLine();
        Customer customer = getCustomer(accountNumber);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        if (customer.getInsuranceAccountNumber() == null) {
            System.out.println("No insurance details to approve.");
            return;
        }

        System.out.println("Insurance details approved for customer.");
    }

    private static void viewInsuranceDetails() {
        System.out.println("Enter customer account number:");
        String accountNumber = scanner.nextLine();
        Customer customer = getCustomer(accountNumber);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Insurance details:");
        System.out.println("Insurance Account Number: " + customer.getInsuranceAccountNumber());
        System.out.println("Insurance Number: " + customer.getInsuranceNumber());
        System.out.println("Insurance Maturity Amount: " + customer.getInsuranceMaturityAmount());
    }

    private static void viewInsuranceDetails(Customer customer) {
        System.out.println("Insurance details:");
        System.out.println("Insurance Account Number: " + customer.getInsuranceAccountNumber());
        System.out.println("Insurance Number: " + customer.getInsuranceNumber());
        System.out.println("Insurance Maturity Amount: " + customer.getInsuranceMaturityAmount());
    }

    private static void calculateInsurancePremium(Customer customer) {
        System.out.println("Insurance Tenure Options:");
        System.out.println("1. 1 Year - 5% return");
        System.out.println("2. 1 Year and 8 Months - 8% return");
        System.out.println("3. 2 Years and 6 Months - 14% return");
        System.out.println("4. 5 Years - 25% return");
        System.out.println("5. 10 Years - 35% return");
        System.out.println("Enter your choice:");
        int tenureChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        double returnRate;
        switch (tenureChoice) {
            case 1:
                returnRate = 1.05;
                break;
            case 2:
                returnRate = 1.08;
                break;
            case 3:
                returnRate = 1.14;
                break;
            case 4:
                returnRate = 1.25;
                break;
            case 5:
                returnRate = 1.35;
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Enter insurance amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        double premium = amount * returnRate;
        System.out.println("The insurance premium for the selected tenure is: " + premium);
    }

    public static String generateAccountNumber() {
        return String.format("%013d", Math.abs(random.nextLong()) % 1_000_000_000_000L);
    }

    public static String generatePanCardNumber() {
        return String.format("%5s%4d%1s", randomString(5), random.nextInt(10_000), randomString(1)).toUpperCase();
    }

    public static String generateInsuranceAccountNumber() {
        return String.format("%015d", Math.abs(random.nextLong()) % 1_000_000_000_000_000L);
    }

    public static String generateInsuranceNumber() {
        return String.format("%05d%04d%05d", random.nextInt(100_000), random.nextInt(10_000), random.nextInt(100_000));
    }

    private static String randomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }
}