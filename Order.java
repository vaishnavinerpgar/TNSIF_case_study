import java.util.Map;

public class Order {
    private int orderId;
    private Customer customer;
    private Map<FoodItem, Integer> items;
    private String status;
    private DeliveryPerson deliveryPerson;

    public Order(int orderId, Customer customer, Map<FoodItem, Integer> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.status = "Pending";
    }

    public void assignDeliveryPerson(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", customer=" + customer.getUsername() +
                ", items=" + items + ", status='" + status + "', deliveryPerson=" + (deliveryPerson != null ? deliveryPerson.getName() : "Not Assigned") + "}";
    }
}