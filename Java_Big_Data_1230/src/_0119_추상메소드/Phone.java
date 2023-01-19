package _0119_추상메소드;
// 추상클래스 만들기
// 인스턴스 필드, 생성자, 인스턴스 메소드 포함
public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name) { // 매개변수가 있는 생성자를 만듬
        this.name = name;
    }
    void setPower(boolean power) {
        isPower = power;
        if (isPower) {
            System.out.println("Phone Power ON");
        }
        else {
            System.out.println("Phone Power OFF");
        }
    }
    abstract void call(); // 상속을 받는 클래스에서 반드시 오버라이딩 해줘야 하는 메소드
    abstract void internet();
}
