import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        String userInput;
        int selection = 0;

        do {
            System.out.println("1. Commercial Customer");
            System.out.println("2. Residential Customer");

            userInput = scan.nextLine();

            // Try to get the integer value of the user input, if not an integer catch the exception
            try {
                selection = Integer.valueOf(userInput);
            } catch(Exception E) {
                System.out.println("You did not enter a valid integer, please try again.");
            }

            if (selection < 1 || selection > 2) {
                System.out.println("The integer you entered is out of range, please try again.");
            } else if(selection == 1 || selection == 2) {
                // The input is valid, break the loop
                loop = false;
            }
        } while(loop);

        if (Double.valueOf(userInput) == 1) {
            Commercial customer1 = new Commercial();

            // Get the data from the user
            System.out.print("What is the companies Name: ");
            customer1.setName(scan.nextLine());
            System.out.print("What is the companies phone number: ");
            customer1.setPhone(scan.nextLine());
            System.out.print("What is the companies address: ");
            customer1.setAddress(scan.nextLine());
            System.out.print("What is the property name: ");
            customer1.setPropertyName(scan.nextLine());

            loop = true;

            // Loop through until the user enters a valid double for the square footage
            do {
                System.out.print("What is the square footage of the commercial property: ");
                try {
                    customer1.setSquareFootage(Double.valueOf(scan.nextLine()));
                    loop = false;   // Break out of the loop, the entry was a valid number
                } catch (Exception e) {
                    System.out.println("Invalid entry, please enter a valid number.");
                }
            } while (loop);

            System.out.print("Are there multiple properties? Y or N: ");

            loop = true;
            do {
                userInput = scan.nextLine();
                // Check the user input whether it is a y or n, ignoring case
                if (userInput.equalsIgnoreCase("y")) {
                    customer1.setMultiProperty(true);
                    loop = false;
                } else if (userInput.equalsIgnoreCase("n")) {
                    customer1.setMultiProperty(false);
                    loop = false;
                } else {
                    // The user did not enter y or n, have them keep trying
                    System.out.print("Invalid entry, please enter either 'Y' or 'N': ");
                }
            } while(loop);

            customer1.weeklyCharge();

        } else if (Double.valueOf(userInput) == 2) {
            Residential customer1 = new Residential();

            // Get the data from the user
            System.out.print("What is the customer Name: ");
            customer1.setName(scan.nextLine());
            System.out.print("What is the customer phone number: ");
            customer1.setPhone(scan.nextLine());
            System.out.print("What is the customer address: ");
            customer1.setAddress(scan.nextLine());

            loop = true;

            // Loop through until the user enters a valid double for the square footage
            do {
                System.out.print("What is the square footage of the property: ");
                try {
                    customer1.setSquareFootage(Double.valueOf(scan.nextLine()));
                    loop = false;   // Break out of the loop, the entry was a valid number
                } catch (Exception e) {
                    System.out.println("Invalid entry, please enter a valid number.");
                }
            } while (loop);

            System.out.print("Senior discount? Y or N: ");

            loop = true;
            do {
                userInput = scan.nextLine();
                // Check the user input whether it is a y or n, ignoring case
                if (userInput.equalsIgnoreCase("y")) {
                    customer1.setSenior(true);
                    loop = false;
                } else if (userInput.equalsIgnoreCase("n")) {
                    customer1.setSenior(false);
                    loop = false;
                } else {
                    // The user did not enter y or n, have them keep trying
                    System.out.print("Invalid entry, please enter either 'Y' or 'N': ");
                }
            } while(loop);

            customer1.weeklyCharge();
        }
    }
}
