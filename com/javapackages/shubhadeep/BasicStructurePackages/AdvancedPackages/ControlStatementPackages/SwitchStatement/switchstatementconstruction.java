package com.javapackages.shubhadeep.BasicStructurePackages.AdvancedPackages.ControlStatementPackages.SwitchStatement;

public class switchstatementconstruction {
    public static void main(String[] args) {

        String customerType = "Regular";
        switch (customerType) {
            case "Regular":
                System.out.println("Regular customer");
                break;
            case "Premium":
                System.out.println("Premium customer");
                break;
            case "VIP":
                System.out.println("VIP customer");
                break;
            default:
                System.out.println("Unknown customer type");
                break;
        }

        //No Break
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the work week");
            case "Tuesday":
                System.out.println("Second day of the work week");
            case "Wednesday":
                System.out.println("Midweek");
            case "Thursday":
                System.out.println("Almost there");
            case "Friday":
                System.out.println("End of the work week");
            default:
                System.out.println("Weekend");
        }

        //default case
        int number = 3;
        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println("Number is not 1 or 2");
                break;
        }

    }
}
