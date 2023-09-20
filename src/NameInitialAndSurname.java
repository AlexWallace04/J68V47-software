import java.util.Scanner;

import java.util.Scanner;

public class NameInitialAndSurname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First Name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Input: Last Name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Input: Year of Birth
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        // Generate Username and Password
        String username = firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase();
        String password = lastName.substring(0, 1).toLowerCase() + firstName.toUpperCase() + yearOfBirth;

        // Display Username and Password
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Close the scanner
        scanner.close();
    }
}