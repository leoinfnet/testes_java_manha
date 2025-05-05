package org.infnet.orders;

public class Customer {
    private String name;
    private boolean isVip;

    public Customer(String name, boolean isVip) {
        this.name = name;
        this.isVip = isVip;
    }

    public String getName() { return name; }
    public boolean isVip() { return isVip; }
}
