package ex1;

public class Book {
    private String color;
    private Integer price;

    @Override
    public String toString() {
        return "Book{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(String color, Integer price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }






}
