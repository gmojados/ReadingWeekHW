package HomeWork;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        yardSaleWholeSale(); // hw1


    }
    public static void yardSaleWholeSale() {
        Scanner scan = new Scanner(System.in);
        DecimalFormat priceFormat = new DecimalFormat("$0.00");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");

        System.out.println("Welcome to YardSaleWholeSale! What product are you looking to buy?");
        String name = scan.next();

        System.out.println("What price are you willing to pay for " + name + "? ");
        double price = scan.nextDouble();

        System.out.println("How many " + name + "s would you like?");
        int quantity = scan.nextInt();

        double totalCost = price * quantity;

        System.out.println("\nName\t\tQty\t\tPrice\t\tTotal");
        System.out.println("---\t\t---\t\t-----\t\t-------");
        System.out.printf("%s\t\t%d\t\t%s\t\t%s\n",
                name, quantity, priceFormat.format(price), priceFormat.format(totalCost));

        System.out.println("\n\tThank you. Come again.");

        LocalDate purchaseDate = LocalDate.of(2024, 4, 25);
        System.out.println("Purchased on: " + purchaseDate.format(dateFormatter));

        scan.close();
    }

    










}
