package _0605_인터페이스복습;

import java.util.Scanner;

public class CocoaTalkMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("곰돌이사육사");
        cocoaTalk.writeMsg("벌써 여름이 왔어요. 잘 지내시죠???");
        NetAdaptor adaptor;
        Scanner sc = new Scanner(System.in);
        System.out.println("네트워크를 선택하세요 [1] WiFi [2] 5G  :   ");
        int sel = sc.nextInt();
        if (sel == 1) adaptor = new WiFi();
        else adaptor = new FiveG();
        cocoaTalk.send(adaptor);
    }
}
