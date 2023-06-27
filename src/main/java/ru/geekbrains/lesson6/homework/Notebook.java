package ru.geekbrains.lesson6.homework;

public class Notebook {
    private String manufacturer;
    private String model;
    private Integer displaySize;
    private Integer ramSize;
    private Integer hddSize;
    private String os;
    private String color;
    private Integer price;

    public Notebook(String manufacturer, String model, Integer displaySize,
                    Integer ramSize, Integer hddSize, String os,
                    String color, Integer price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.displaySize = displaySize;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public Notebook() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(Integer displaySize) {
        this.displaySize = displaySize;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public Integer getHddSize() {
        return hddSize;
    }

    public void setHddSize(Integer hddSize) {
        this.hddSize = hddSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
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

    @Override
    public String toString() {
        return "Notebook{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", displaySize='" + displaySize + '\'' +
                ", ramSize=" + ramSize +
                ", hddSize=" + hddSize +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
