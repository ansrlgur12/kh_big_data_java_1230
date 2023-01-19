package _0119_추상메소드;

public class AbstractMainEx2 {
    public static void main(String[] args) {
       Phone phone = new SmartPhone("Galaxy S22");
       phone.setPower(true);
       phone.call();
       phone.internet();
    }
}
