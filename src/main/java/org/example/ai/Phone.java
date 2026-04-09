package org.example.ai;

public class Phone {

    private Integer ram;
    private String name;
    private Integer price;
    private String color;

    public Phone(Integer ram, String name, Integer price, String color) {
        this.ram = ram;
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram=" + ram +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
