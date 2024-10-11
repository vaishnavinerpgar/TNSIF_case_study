import java.util.Scanner;

public class FoodDeliveryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant restaurant = new Restaurant(101, "HariOmDhaba");
        restaurant.addFoodItem(new FoodItem(1, "PanjabiThali", 340));
        restaurant.addFoodItem(new FoodItem(2, "PavBhaji", 140));

        Customer customer = new Customer(1001, "Alpana", 7720092235L);

        while (true) {
            System.out.println("1. View Food Items");
            System.out.println("2. Add Food to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Place Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Menu: " + restaurant.getMenu());
                    break;
                case 2:
                    System.out.print("Enter Food Item ID: ");
                    int foodItemId = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    FoodItem foodItem = restaurant.getMenu().stream()
                            .filter(item -> item.getId() == foodItemId)
                            .findFirst()
                            .orElse(null);
                    if (foodItem != null) {
                        customer.getCart().addItem(foodItem, quantity);
                        System.out.println("Food item added to cart!");
                    } else {
                        System.out.println("Invalid Food Item ID!");
                    }
                    break;
                case 3:
                    System.out.println(customer.getCart());
                    break;
                case 4:
                    Order order = new Order(1, customer, customer.getCart().getItems());
                    System.out.println("Order placed successfully! Order ID: " + order);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}