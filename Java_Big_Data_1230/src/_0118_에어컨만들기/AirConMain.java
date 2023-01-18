package _0118_에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0; // 경과시간을 계산하기 위한 변수
        boolean isSetTemp = false; // 온도가 변경 되어야할 시점 확인

        System.out.print("에어컨을 켜시겠습니까? (yes/no) : ");
        String isON = sc.next(); // 에어컨을 켜기 위한 문자열 입력
        if (isON.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirConState(); // 온도와 바람세기를 설정하고 설정에 따라 쿨러나 히터값 변경
            while (true) {
                sleep(1000); // 1000분의 1초단위 // 쓰레드가 잠을 잔다
                elapsedTime++;
                switch (lgAirCon.getWindStep()) {
                    case 1 : if (elapsedTime >= 60) isSetTemp = true; break;
                    case 2 : if (elapsedTime >= 30) isSetTemp = true; break;
                    case 3 : if (elapsedTime >= 20) isSetTemp = true; break;
                    default :
                }
                if (isSetTemp) {
                    if (lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if (lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                if (lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료합니다.");
                    break;
                }
            }


        }


    }
}
