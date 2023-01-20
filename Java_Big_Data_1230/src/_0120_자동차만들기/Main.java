package _0120_자동차만들기;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("이동지역을 선택하세요 [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
            int area = sc.nextInt();
            if (area < 1 || area > 4) {
                    System.out.print("잘못입력하였습니다");
                    return;
                }
            while(true) {
                System.out.print("이동할 승객 수를 입력하세요 : ");
                int passenger = sc.nextInt();
                if (passenger > 20) {
                    System.out.println("최대 20명의 승객까지 가능합니다.");
                }
                else if (passenger > 5) {
                    System.out.println(passenger + "명은 버스밖에 못탑니다");
                    Bus bus = new Bus("고속버스");
                    bus.turboOnOff();
                    bus.setAmount(area);
                    bus.setGasStation(area);
                    bus.time(area);
                    break;
                } else if (passenger > 2) {
                    System.out.print("이동 차량을 선택하세요 [1] 승용차 [2] 버스 : ");
                    int v = sc.nextInt();
                    if (v == 1) {
                        Sedan sedan = new Sedan("아반떼");
                        sedan.turboOnOff();
                        sedan.setAmount(area);
                        sedan.setGasStation(area);
                        sedan.time(area);
                    } else {
                        Bus bus = new Bus("고속버스");
                        bus.turboOnOff();
                        bus.setAmount(area);
                        bus.setGasStation(area);
                        bus.time(area);
                    }
                    break;
                } else {
                    System.out.print("이동 차량을 선택하세요 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
                    int v = sc.nextInt();
                    switch (v) {
                        case 1: {
                            SportsCar sportsCar = new SportsCar("포르쉐");
                            sportsCar.turboOnOff();
                            sportsCar.setAmount(area);
                            sportsCar.setGasStation(area);
                            sportsCar.time(area);
                            break;
                        }
                        case 2: {
                            Sedan sedan = new Sedan("아반떼");
                            sedan.turboOnOff();
                            sedan.setAmount(area);
                            sedan.setGasStation(area);
                            sedan.time(area);
                            break;
                        }
                        case 3: {
                            Bus bus = new Bus("고속버스");
                            bus.turboOnOff();
                            bus.setAmount(area);
                            bus.setGasStation(area);
                            bus.time(area);
                            break;
                        }
                        default:
                    } break;
                }
            }
    }
}
