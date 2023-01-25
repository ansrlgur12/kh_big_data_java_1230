package _0125_다중인터페이스;

import javax.swing.plaf.IconUIResource;

public class SportsCar extends Car implements AirCon, AutoDrive {
    private  boolean isAirCon; // ON / OFF
    private  int setTemp;
    private boolean isAutoDrv;
    private boolean isTurbo;

    public SportsCar(boolean isAirCon, int setTemp, boolean isAutoDrv, int speed, String color, String year, boolean isTurbo ) {
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.speed = speed;
        this.color = color;
        this.year = year;
        this.isTurbo = isTurbo;
    }
    public void viewInfo() {
        String airConStr = (isAirCon) ? "ON" : "OFF";
        String autoStr = (isAutoDrv) ? "ON" : "OFF:";
        String turboStr = (isTurbo) ? "ON" : "OFF";
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("연도 : " + year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("온도 : " + setTemp);
        System.out.println("자율주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);
    }

    @Override
    public void airConON() {
        System.out.println("에어컨을 켰습니다.");
    }

    @Override
    public void airConOFF() {
        System.out.println("에어컨을 껐습니다.");
    }

    @Override
    public void setAirConTemp(int tmp) {
        System.out.println("에어컨 설정 온도를 " + tmp + "로 변경 하였습니다.");
    }

    @Override
    public void autoDrvON() {
        System.out.println("자율주행 모드를 켰습니다.");
    }

    @Override
    public void autoDryOFFF() {
        System.out.println("자율주행 모드를 껐습니다.");
    }
}
