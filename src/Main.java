import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Double> itemCost = new ArrayList<>();
        double totalCost = 0.0;

        try (FileWriter writer = new FileWriter("expenses.txt", true)) {
            String continueInput;

            do {
                System.out.println("Enter the item description: ");
                String itemDescription = scanner.nextLine();

                System.out.println("Enter the price of the item: ");
                double price = Double.parseDouble(scanner.nextLine());

                System.out.println("Enter the date of the purchase: ");
                String datePurchased = scanner.nextLine();

                itemList.add(itemDescription + " on " + datePurchased);
                itemCost.add(price);
                totalCost += price;

                String entry = String.format("Item: %s | Price: $%.2f | Date: %s\n", itemDescription, price, datePurchased);
                writer.write(entry);

                System.out.println("Added: " + entry);
                System.out.println("Would you like to add another item? (yes/no)");
                continueInput = scanner.nextLine().trim().toLowerCase();

            } while (continueInput.equals("yes"));

            writer.write(String.format("Total spent: $%.2f\n\n", totalCost));
            System.out.printf("Total expenses recorded: $%.2f\n", totalCost);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}
