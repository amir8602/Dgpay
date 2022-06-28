package collections.set.treeSet;

import java.math.BigDecimal;

public class Car implements Comparable<Car>{
    private String name;
    private String color;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static Car carFactory(String name , String color , BigDecimal price){
        return new Car(){{
            setName(name);
            setColor(color);
            setPrice(price);
        }};
    }

    @Override
    public int compareTo(Car o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}
