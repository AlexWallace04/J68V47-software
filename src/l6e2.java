import java.util.Scanner;

public class l6e2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. 'hello'");
            System.out.println("2. Tell me the time");
            System.out.println("3. Tell me a joke");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            // Read user's choice
            choice = scanner.nextLine();

            // Process the user's choice
            switch (choice) {
                case "1":
                    System.out.println("Hello!");
                    break;
                case "2":
                    // You can add code here to display the current time
                    System.out.println("Current time: [Add time here]");
                    break;
                case "3":
                    // You can add code here to tell a joke
                    System.out.println("Why don't scientists trust atoms? Because they make up everything!");
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}




