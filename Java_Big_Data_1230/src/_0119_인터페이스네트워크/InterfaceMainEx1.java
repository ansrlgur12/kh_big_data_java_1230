package _0119_인터페이스네트워크;
// 지역변수 - 스택영역에 저장, 중괄호가 끝나면 사라짐
// 힙 영역은 참조하는 변수가 없어지면 지워짐
import java.util.Scanner;

public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택 하세요 [1] WiFi [2] 5G [3] LTE : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 : adapter = new WiFi("KT Megapass"); break;
            case 2 : adapter = new FiveG("SK Telecom"); break;
            case 3 : adapter = new LTE("LG U+"); break;
            default: System.out.println("네트워크를 잘못 선택하였습니다.");
        }
        adapter.connect();
    }
}
