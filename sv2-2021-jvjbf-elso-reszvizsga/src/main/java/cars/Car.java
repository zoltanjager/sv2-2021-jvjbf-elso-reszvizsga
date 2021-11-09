package cars;

public class Car {

    private String brand;
    private double sizeOfEngine;
    private Color color;
    private int price;

    public Car(String brand, double sizeOfEngine, Color color, int price) {
        this.brand = brand;
        this.sizeOfEngine = sizeOfEngine;
        this.color = color;
        this.price = price;
    }

    public void decreasePrice(int percent) {
        price = price - (price * percent / 100);
    }

    public String getBrand() {
        return brand;
    }

    public double getSizeOfEngine() {
        return sizeOfEngine;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
