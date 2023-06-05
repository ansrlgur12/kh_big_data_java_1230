package _0605_다형성복습;

// 다형성의 특성을 활용하여 여러가지 타입을 한가지 타입으로 처리하는 기술
// 즉, 부모클래스 타입의 참조변수로 자식 클래스의 인스턴스르 참조할 수 있음

import java.util.Scanner;

public class PolyEx05 {
    public static void main(String[] args) {
        Driver driver = new Driver("곰돌이");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportsCar sportsCar = new SportsCar();
        Scanner sc = new Scanner(System.in);
        System.out.println("운전할 차를 선택하세요 [1] 버스 [2] 택시 [3] 스포츠카 : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1 : driver.drive(bus); break;
            case 2 : driver.drive(taxi); break;
            case 3 : driver.drive(sportsCar); break;
            default: break;
        }

    }
}
