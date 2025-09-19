package example.shop;

public class OrderItem {
    private final String name;
    private final int quantity;
    private final int unitPrice;

    public OrderItem(String name, int quantity, int unitPrice) {
        // 생성자를 통해 final 초기값 세팅!
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int lineTotal() {
        return quantity * unitPrice;
    }
}
