package _0118_Re에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon samsungAirCon = new AirCon();
        Scanner sc = new Scanner(System.in);
        int eTime = 0;
        boolean isSetTemp = false;

        System.out.print("에어컨 켜시겟습니까? (y/n) : ");
        String onOff = sc.next();
        if (onOff.equalsIgnoreCase("Y")) {
            samsungAirCon.setPower(true);
            samsungAirCon.setAirCon();
            while (true) {
                sleep(1000);
                eTime++;
                switch (samsungAirCon.getWindTemp()) {
                    case 1 : if (eTime >= 6) isSetTemp = true; break;
                    case 2 : if (eTime >= 3) isSetTemp = true; break;
                    case 3 : if (eTime >= 2) isSetTemp = true; break;
                    default:
                }
                if (isSetTemp) {
                    if (samsungAirCon.isCooler()) samsungAirCon.setNowTemp(-1);
                    if (samsungAirCon.isHeater()) samsungAirCon.setNowTemp(1);
                    samsungAirCon.airConInfo();
                    isSetTemp = false;
                    eTime = 0;

                }
                if (samsungAirCon.getNowTemp() == samsungAirCon.getSetTemp()) {
                    System.out.println("에어컨 끗");
                    break;
                }
            }
        }
    }
}
