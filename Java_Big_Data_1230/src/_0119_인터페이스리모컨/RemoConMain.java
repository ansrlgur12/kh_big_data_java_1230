package _0119_인터페이스리모컨;

import java.util.Scanner;

public class RemoConMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택 하세요 [1] TV [2] Audio : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if (sel == 1) {
            rc = new Televison();
            rc.turnOn();
            rc.setVolume(20);
            rc.getInfo();
            rc.setMute(true); // default 메소드이며 오버라이딩 되어있는 메소드 사용
        } else {
            rc = new Audio();
            rc.turnOn();
            rc.setVolume(120);
            rc.getInfo();
            rc.setMute(false); // default 메소드이고 부모에서 만든 메소드 사용
        }
        RemoteControl.changeBattery();

        RemoteControl remoteControl = new RemoteControl() {

            int volume;
            @Override
            public void turnOn() {
                System.out.println("플스 5 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("플스 5 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                }
                else if(volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                }
                else this.volume = volume;
                System.out.println("현재 플스 볼륨 : " + this.volume);
            }

            @Override
            public void getInfo() {

            }
        };
        remoteControl.turnOn();
        remoteControl.setVolume(150);
        remoteControl.turnOff();
    }
}
