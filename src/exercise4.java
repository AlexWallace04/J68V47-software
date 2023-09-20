import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First Name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Input: Last Name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("What is the total value of your order: ");
        int TotalValue = scanner.nextInt();


        System.out.print("How much would you wish to deposit?: ");
        int Deposit = scanner.nextInt();
        System.out.print("--== RECEIPT ==-- ");
        String username = firstName.substring(0, 1).toUpperCase() + lastName.substring(0,1).toUpperCase() + lastName.substring(1,7).toLowerCase();

        int result = TotalValue - Deposit ;
                System.out.format("\nCustomer is " + username);
                System.out.print("\nOrderTotal " + TotalValue);
                System.out.print("\nYour Deposit " + Deposit);
                System.out.format("\nTotal =" + result );
                System.out.print("\nYou get a free toaster! ");
                System.out.print("\nHave a nice day");


    }
}