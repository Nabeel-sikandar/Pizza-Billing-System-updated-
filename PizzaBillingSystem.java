import java.util.Scanner;

public class PizzaBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pizzaSize;
        int basePrice = 0;
        int totalBill = 0;
        // Get pizza size with validation
        while (true) {
            System.out.println("-------- Welcome to Nebii Pizza House ------- ");
            System.out.println("Do you want to Order;-");
            System.out.print("Enter pizza size: ");
            pizzaSize = scanner.nextLine().toLowerCase().trim();

            if (pizzaSize.equals("small")) {
                basePrice = 100;
                break;
            } else if (pizzaSize.equals("medium")) {
                basePrice = 200;
                break;
            } else if (pizzaSize.equals("large")) {
                basePrice = 300;
                break;
            } else {
                System.out.println("Invalid ? Try again.");
                continue;
            }
        }

        totalBill = basePrice;

        // Ask for pepperoni
        while (true) {
            System.out.print("Do you want pepperoni? ");
            String pepperoni = scanner.nextLine().toLowerCase().trim();

            if (pepperoni.equals("yes") || pepperoni.equals("y")) {
                if (pizzaSize.equals("small")) {
                    totalBill += 30;
                } else if (pizzaSize.equals("medium") || pizzaSize.equals("large")) {
                    totalBill += 50;
                }
                break;
            } else if (pepperoni.equals("no") || pepperoni.equals("n")) {
                break;
            } else {
                System.out.println("Invalid ? Please enter yes or no.");
                continue;
            }
        }

        // Ask for extra cheese
        while (true) {
            System.out.print("Do you want extra cheese? ");
            String extraCheese = scanner.nextLine().toLowerCase().trim();

            if (extraCheese.equals("yes") || extraCheese.equals("y")) {
                totalBill += 20;
                break;
            } else if (extraCheese.equals("no") || extraCheese.equals("n")) {
                break;
            } else {
                System.out.println("Invalid ? Please enter yes or no.");
                continue;
            }
        }
        // Display final bill
        System.out.println("\nYour final bill is: " + totalBill + " rupees.");
    }
}