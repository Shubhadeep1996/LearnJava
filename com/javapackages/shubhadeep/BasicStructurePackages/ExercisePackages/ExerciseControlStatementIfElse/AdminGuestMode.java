package com.javapackages.shubhadeep.BasicStructurePackages.ExercisePackages.ExerciseControlStatementIfElse;

public class AdminGuestMode {
    public static final String ADMIN_MODE = "--admin";
    public static final String GUEST_MODE = "--guest";

    public static void main(String[] args) {
        boolean isAdmin = false;
        boolean isGuest = false;


        if (args.length > 0) {
            if (args[0].equals(ADMIN_MODE)) {
                isAdmin = true;
            } else if (args[0].equals(GUEST_MODE)) {
                isGuest = true;
            }
        }

        if (args.length > 1) {
            if (args[1].equals(ADMIN_MODE)) {
                isAdmin = true;
            } else if (args[1].equals(GUEST_MODE)) {
                isGuest = true;
            }
        }


        if (isAdmin && isGuest) {
            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        } else if (isAdmin) {
            System.out.println("Hello, Admin!");
        } else if (isGuest) {
            System.out.println("Hello, Guest!");
        } else {
            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        }
    }
}