import java.util.Scanner;

public class NameInitialAndSurname {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Prompt the user for their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // Prompt the user for their year of birth
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Get the first letter of the first name in uppercase
        char firstInitial = Character.toUpperCase(firstName.charAt(0));

        // Display the first letter of the first name in uppercase and the whole surname
        System.out.println("First letter of your name in uppercase: " + firstInitial);
        System.out.println("Your surname: " + surname);
    }
}