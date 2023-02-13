package _0213_자바복습1;

import java.io.Serializable;

public class CarMenuInfo implements Serializable {
    private String name;  // 차종
    private int year;     // 연식
    private String color; // 색상
    private int price;    // 가격
    private String type;  // 종류

    public CarMenuInfo(String name, int year, String color, int price, String type) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
