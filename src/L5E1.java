import java.util.Scanner;

public class L5E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Get the range up to which you want to display the times table
        System.out.print("Enter the range: ");
        int rangeLimit = scanner.nextInt();

        // Display the times table
        System.out.println("Times Table for " + num + " up to " + rangeLimit + ":");

        for (int i = 1; i <= rangeLimit; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}