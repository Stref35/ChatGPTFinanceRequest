import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        //Finance Tracker Basic
        //Utilizing ChatGPT for projects



        System.out.println("Enter the item description: ");
        String itemDescription = scanner.nextLine();
        itemList.add(itemDescription);

        System.out.println("Enter the price of the item: ");
        double price = scanner.nextDouble();


        System.out.println("Enter the date of the purchase: ");
        String datePurchased = scanner.next();
        itemList.add(datePurchased);

        System.out.println("You have purchased " + itemDescription + " for" + " $" + price + " " + "on " + datePurchased);

        System.out.println(itemList);


        scanner.close();

    }
}
