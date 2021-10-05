package password_generator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of password you want to generate: ");
        int lengthOfPassword = scan.nextInt();

        String result = generatePassword(lengthOfPassword);
        System.out.println(result);

    }

    static String generatePassword(int numberOfChars) {
        String expectedValues = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxtz0123456789!@#$%^&*()_/*-+?";
        String passwordGenerated = "";

        for (int i=0; i<numberOfChars; i++) {
            passwordGenerated += expectedValues.charAt((int) Math.floor(Math.random() * Math.floor(expectedValues.length())));
        }

        return passwordGenerated;
    }
}
