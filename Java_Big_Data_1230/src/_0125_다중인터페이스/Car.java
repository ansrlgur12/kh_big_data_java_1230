package _0125_다중인터페이스;

public class Car {
    protected int speed; // protected 접근자는 동일 패키지와 상속관계에서 접근 가능
    protected String color;
    protected String year;
    public Car() {
        this.speed = 150;
        this.color = "white";
        this.year = " 2022";
    }
}
