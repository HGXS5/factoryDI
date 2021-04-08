package cn.example.ssh.demo.testcar;

public class Car {
    private double price;
    private String brand;

    public Car(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public Car() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
