package 목12__아이패드만들기;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IpadProMake {
    private int screen;  // 화면 크기 : 11인치, 12.9인치
    private int color;   // 색상 : 스페이스그레이, 실버
    private int memory;  // 용량 : 256GB, 256GB, 512GB, 1TB
    private int network; // 네트워크 : Wi-Fi, Wi-Fi+Cellular
    private String name; // 각인서비스 시 이름 저장
    private String productDate; // 제품 생산 일자 (시리얼넘버 만들 때 사용)
    private String serialNum;   // 제품 일련 번호 : iPad1312802301121
    private static int cnt = 0; // 클래스 변수 : 객체 생성 시 생성되지 않고 클래스 생성 시 만들어 짐

    public IpadProMake(String name) {
        this.name = name;
        Date now = new Date(); // 현재의 시간정보를 가져오기 위해서 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        productDate = sdf.format(now); // 시간 정보 중 "yyMMdd" 패턴으로 시간정보를 가져옴
        cnt++; // 생성자는 객체가 만들어 질 때 호출 되므로 생성된 객체의 횟수를 확인하는 용도로 사용 할 수 있음
        productDate += cnt; // 연 + 월 + 일 + 생산대수
    }

    // 제품 구매에 대한 진행 여부를 묻는 메뉴 만들기
    public boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== iPad Pro 구입하기 ====");
        System.out.print("구입 하시려면 yes / 종료는 quit : ");
        String isContinue = sc.next();
        if (isContinue.equalsIgnoreCase("yes")) return true;
        return false;
    }

    // 화면 크기 정하기
    public void setScreen() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("디스플레이 선택 [1] 11인치  [2] 12.9인치  : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return; // 여기서 해당 메소드가 끝남
            System.out.println("디스플레이를 다시 선택하세요.");
        }
    }

    public void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("컬러를 선택  [1] 스페이스 그레이  [2] 실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            System.out.println("컬러를 다시 선택 하세요.");

        }
    }

    public void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택   [1] 128GB  [2] 256GB  [3] 512GB  [4] 1TB  : ");
            memory = sc.nextInt();
            if (memory > 0 && memory < 5) return;
            System.out.println("용량을 다시 선택하세요.");
        }
    }

    public void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("네트워크 선택 [1] Wi-Fi   [2] Wi-Fi + Cellular : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.print("네트워크를 다시 선택하세요.");
        }
    }

    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청 하시겠습니까? (yes/no) : ");
        String service = sc.next();
        if (service.equalsIgnoreCase("yes")) {
            System.out.print("이름을 입력 하세요 : ");
            name = sc.next();
        }
    }
    // 일련번호 만들기 : iPad + 11/13 + 128/256/512/1024 + W/C + 230112 + 생산댓수
    public void setSerialNum() {
        String scrStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + scrStr + memStr[memory] + netStr + productDate;
    }
    // 제품 구매가 완료 되면 출고까지 30초 대기 이후 출고 하기
    public void inProductPad() throws InterruptedException {
        int cnt = 0;
        while(true) {
            sleep(300);
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%] >>");
            System.out.print("\r");
            if (cnt >= 100) break;
        }
    }

    public void productPad() {
        final String[] scrType = {"", "11인치", "12.9인치"};
        final String[] colorType = {"", "스페이스 그레이", "실버"};
        final String[] memType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType = {"", "Wi-Fi", "Wi-Fi + Cellular"};
        System.out.println("==== iPad Pro 가 출고 되었습니다. ====");
        System.out.println("디스플레이 : " + scrType[screen]);
        System.out.println("제품 색상  : " + colorType[color]);
        System.out.println("제품 용량  : " + memType[memory]);
        System.out.println("네트워크   : " + netType[network]);
        System.out.println("이름      : " + name);
        System.out.println("일련번호(S/N) : " + serialNum);
        System.out.println("----------------------------");
    }
}




