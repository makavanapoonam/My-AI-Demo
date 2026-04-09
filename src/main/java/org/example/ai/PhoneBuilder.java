package org.example.ai;

public class PhoneBuilder {

    private Integer ram;
    private String name;
    private Integer price;
    private String color;

    public PhoneBuilder setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Phone getPhone(){
        return new Phone(ram,name,price,color);
    }
}
