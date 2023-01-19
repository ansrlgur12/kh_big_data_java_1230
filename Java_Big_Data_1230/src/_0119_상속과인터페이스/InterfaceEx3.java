package _0119_상속과인터페이스;

import java.util.Scanner;

public class InterfaceEx3 {
    public static void main(String[] args) {
        // NetworkAdapter2 adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크 선택 [1] WiFi [2] 5G : ");
        int num = sc.nextInt();
        if (num == 1) {
            WiFi wiFi = new WiFi("KT", "고유림");
            wiFi.connect();
            wiFi.sendMsg();
            wiFi.rcvMsg();
        }
        else {
            FiveG fiveG = new FiveG("SK Telecom", "나희도");
            fiveG.connect();
            fiveG.sendMsg();
            fiveG.rcvMsg();
        }
    }
}
