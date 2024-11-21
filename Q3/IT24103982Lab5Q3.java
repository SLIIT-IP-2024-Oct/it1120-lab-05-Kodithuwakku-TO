import java.util.Scanner;
public class IT24103982Lab5Q3 {
    public static void main(String[] args) {
        // Constants
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_10_PERCENT = 10;
        final int DISCOUNT_20_PERCENT = 20;
        
        Scanner scanner = new Scanner(System.in);

        // Input Start Date
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        // Input End Date
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1: Dates must be between 1 and 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2: Start date must be less than end date
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate;

        // Calculate the total amount
        int totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        if (numberOfDays >= 3 && numberOfDays <= 4) {
            totalAmount -= totalAmount * DISCOUNT_10_PERCENT / 100;
        } else if (numberOfDays >= 5) {
            totalAmount -= totalAmount * DISCOUNT_20_PERCENT / 100;
        }

        // Display the result
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + ".00/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount + ".00");
    }
}