package _0118_Re에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

// 기능 설계
// - 전원 ON/OFF
// - 온도 설정 기능(1도 단위 설정)
// - 현재 온도 표시 기능
// - 냉방기 ON/OFF 기능
// - 난방기 ON/OFF 기능
// - 바람세기 설정기능 (1단계 / 2단계 / 3단계)
// 설정 조건 및 동작
// - 설정된 온도에 따라 온도 조절 가능 (60초 / 30초 / 20초) 주기로 온도 변경
// - 에어컨의 동작은 Scanner 로 특정문자를 입력 받아 동작시킴
// - 현재 온도 표시를 위해 캘린더 API 를 이용해서 해당 달의 적절한 온도를 가져오도록 구현
// - 현재 온도와 설정 온도가 같아지면 자동 종료
public class AirCon {
    private boolean isPower;
    private int setTemp;
    private int nowTemp;
    private boolean isCooler;
    private boolean isHeater;
    private int windTemp;

    public AirCon(){
        final int[] monthTemp = {-1, 3, 10, 16, 18, 25, 28, 32, 29, 25, 15, 7};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);
        isPower = false;
        setTemp = 18;
        nowTemp = monthTemp[month];
        isCooler = false;
        isHeater = false;
        windTemp = 1;
    }
    public void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("=============== 에어컨 정보 ==============");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + nowTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windTemp]);
    }
    public void setAirCon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재온도는 " + nowTemp);
        System.out.print("온도를 설정하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정온도는 " + setTemp + "입니다.");
        System.out.print("바람세기를 설정하세요 [1] [2] [3] : ");
        windTemp = sc.nextInt();
        if (nowTemp > setTemp) {
            System.out.println("에어컨이 가동합니다");
            isCooler = true;
            isHeater = false;
        }
        else if (nowTemp < setTemp) {
            System.out.println("히터가 가동합니다.");
            isCooler = false;
            isHeater = true;
        }
        else {
            isHeater = false;
            isCooler = false;
        }
    }

    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindTemp() {
        return windTemp;
    }
    public boolean isHeater() {
        return isHeater;
    }
    public boolean isCooler() {
        return isCooler;
    }
    public void setNowTemp(int i) {
        nowTemp += i;
    }
    public int getNowTemp() {
        return nowTemp;
    }
    public int getSetTemp() {
        return setTemp;
    }
}
