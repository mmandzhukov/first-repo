package JavaExercises.Methods;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        if (!lengthValidator(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!contentValidator(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitCountValidator(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (lengthValidator(password) && contentValidator(password) && digitCountValidator(password)) {
            System.out.println("Password is valid");
        }
    }

    static boolean lengthValidator(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    static boolean contentValidator(String password) {
        for (int i = 0; i <= password.length() - 1; i++) {
            char currentSymbol = password.charAt(i);
            boolean isSmallLetter = currentSymbol >= 97 && currentSymbol <= 122;
            boolean isCapitalLetter = currentSymbol >= 65 && currentSymbol <= 90;
            boolean isNumber = currentSymbol >= 48 && currentSymbol <= 57;
            if (!isSmallLetter && !isCapitalLetter && !isNumber) {
                return false;
            }
        }

        return true;
    }

    static boolean digitCountValidator(String password) {
        int digitCount = 0;
        for (int i = 0; i <= password.length() - 1; i++) {
            char currentSymbol = password.charAt(i);
            if ((Character.isDigit(currentSymbol))) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}




