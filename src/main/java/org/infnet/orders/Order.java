package org.infnet.orders;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();
    private double discount;
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double somaDosPrecos = items.stream().mapToDouble(OrderItem::getTotal).sum();
        return somaDosPrecos - getDiscount();
    }

    public void applyDiscount() {
        double total = calculateTotal();
        if (customer.isVip()) {
            discount = total * 0.15;
        } else if (total > 500) {
            discount = total * 0.1;
        } else {
            discount = 0;
        }
    }
    public double getDiscount() { return discount; }
    public List<OrderItem> getItems() { return items; }
    public Customer getCustomer() { return customer; }
}
