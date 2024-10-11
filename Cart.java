import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<FoodItem, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addItem(FoodItem foodItem, int quantity) {
        items.put(foodItem, quantity);
    }

    public void removeItem(FoodItem foodItem) {
        items.remove(foodItem);
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart:\n");
        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
            sb.append(entry.getKey().getName())
              .append(" x ").append(entry.getValue())
              .append(" = ").append(entry.getKey().getPrice() * entry.getValue())
              .append("\n");
        }
        return sb.toString();
    }
}