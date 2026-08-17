import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();

        while (true) {

            System.out.println("\n===== SHOPPING CART =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Remove Product");
            System.out.println("4. View Total");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter price: ₹");
                    double price = sc.nextDouble();

                    if (price <= 0) {
                        System.out.println("Invalid price!");
                    } else {
                        cart.add(new Product(name, price));
                        System.out.println("Product added to cart!");
                    }
                    break;

                case 2:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        System.out.println("\n===== YOUR CART =====");

                        for (int i = 0; i < cart.size(); i++) {
                            Product p = cart.get(i);
                            System.out.printf("%d. %s - ₹%.2f%n",
                                    i + 1, p.name, p.price);
                        }
                    }
                    break;

                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        System.out.print("Enter product number to remove: ");
                        int number = sc.nextInt();

                        if (number >= 1 && number <= cart.size()) {
                            Product removed = cart.remove(number - 1);
                            System.out.println(removed.name + " removed.");
                        } else {
                            System.out.println("Invalid product number!");
                        }
                    }
                    break;

                case 4:
                    double total = 0;

                    for (Product p : cart) {
                        total += p.price;
                    }

                    System.out.printf("Total: ₹%.2f%n", total);
                    break;

                case 5:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        double bill = 0;

                        System.out.println("\n===== BILL =====");

                        for (Product p : cart) {
                            System.out.printf("%s - ₹%.2f%n",
                                    p.name, p.price);
                            bill += p.price;
                        }

                        System.out.printf("Total: ₹%.2f%n", bill);
                        System.out.println("Thank you for shopping!");

                        cart.clear();
                    }
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
