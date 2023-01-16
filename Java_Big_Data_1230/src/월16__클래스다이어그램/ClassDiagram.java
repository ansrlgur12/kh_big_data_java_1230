package 월16__클래스다이어그램;
// 클래스다이어그램 (클래스 = Circle)
// + PI : double = 3.14 => public static final double PI = 3.14
// - radius : double    => private double radius;
// + Circle(radius:double) => public Circle(double radius)
public class ClassDiagram {
    public static void main(String[] args) {
        Circle circle = new Circle(20); // 객체 생성 시 생성자의 매개변수를 넣어야함
        circle.setRadius(3.1);
        circle.draw();

    }
}
class Circle {
    public final static double PI = 3.14;
    private double radius; // 접근제한자 확인    + : public / - : private
    public Circle(double radius) { // 생성자 호출 시 매개변수가 필요 함.
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double setRadius(double radius) {
        this.radius = radius;
        return PI;
    }
    void draw() {
        System.out.println("반지름이 " + radius + "인 원을 생성합니다");
    }
}