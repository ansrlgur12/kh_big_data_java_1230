package _0605_추상클래스복습;

public abstract class Phone {
    public String name;
    public boolean isPower;
    public Phone(String name) {
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if (isPower) {
            System.out.println(name + " Phone Power ON");
        } else {
            System.out.println(name + " Phone Power OFF");
        }
    }
    abstract void call(); // 추상메소드는 구현부가 있으면 안됌
}
