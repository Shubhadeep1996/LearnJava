package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExerciseUserActivitySelector;

import java.util.Scanner;

public class useracitvityselectorex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one of the possible events: login, sign_up, terminate_program, main_menu, about_app");

        String userInput = scanner.nextLine();

        switch (userInput) {
            case "login":
                System.out.println("Please, enter your username");
                break;
            case "sign_up":
                System.out.println("Welcome!");
                break;
            case "terminate_program":
                System.out.println("Thank you! Good bye!");
                break;
            case "main_menu":
                System.out.println("Main menu");
                break;
            case "about_app":
                System.out.println("This app is created by me \u00AEShubhadeep_Naskar");
                break;
            default:
                System.out.println("Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app");
                break;
        }

        scanner.close();
    }
}