public class DeliveryPerson {
    private int deliveryPersonId;
    private String name;
    private long contactNo;

    public DeliveryPerson(int deliveryPersonId, String name, long contactNo) {
        this.deliveryPersonId = deliveryPersonId;
        this.name = name;
        this.contactNo = contactNo;
    }

    // Add this getter method
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DeliveryPerson{id=" + deliveryPersonId + ", name='" + name + "', contactNo=" + contactNo + "}";
    }
}