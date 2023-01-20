package _0120_자동차만들기;

import java.util.Scanner;
abstract public class Car {
    String name;
    int speed;
    int fuel;
    int tankSize;
    int seat;
    int[] areaKm = {0,400, 200, 150, 300};
    Scanner sc = new Scanner(System.in);

    Car(String name) {
        this.name = name;
    }
    void getInfo(int area){
        System.out.println(name + "을(를) 탑니다.");
        System.out.printf("총 %.2f시간 걸립니다.\n", (double)areaKm[area] / speed);
        System.out.println(name + "가 주유소에 들려야할 횟수는 " + ((areaKm[area]/fuel)/tankSize) + "번 입니다.");
        System.out.println(name + "가 운행시 들어갈 총 비용은 " + ((areaKm[area]/fuel)*2000));
    }
    abstract void turboOnOff();
}
class SportsCar extends Car {
    boolean isTurbo;
    SportsCar(String name) {
        super("스포츠카");
        isTurbo = false;
        speed = 250;
        this.name = name;
        tankSize = 30;
        seat = 2;
        fuel = 8;
    }
    @Override
    void turboOnOff() {
        System.out.print("보조기능을 켜시겠습니까? (y/n) : ");
        String onOff = sc.next();
        if (onOff.equalsIgnoreCase("Y")) speed *= 1.2;
    }
}
class Sedan extends Car {
    boolean isTrunk;
    Sedan(String name) {
        super("승용차");
        isTrunk = false;
        speed = 200;
        this.name = name;
        tankSize = 45;
        seat = 4;
        fuel =12;
    }
    @Override
    void turboOnOff() {
        System.out.print("보조기능을 켜시겠습니까? (y/n) : ");
        String onOff = sc.next();
        if (onOff.equalsIgnoreCase("Y")) seat = 5;
    }
}
class Bus extends Car {
    boolean isTank;
    Bus(String name) {
        super("버스");
        isTank = false;
        speed = 150;
        this.name = name;
        tankSize = 100;
        seat = 20;
        fuel = 5;
    }
    @Override
    void turboOnOff() {
        System.out.print("보조기능을 켜시겠습니까? (y/n) : ");
        String onOff = sc.next();
        if (onOff.equalsIgnoreCase("Y")) tankSize = 130;
    }
}