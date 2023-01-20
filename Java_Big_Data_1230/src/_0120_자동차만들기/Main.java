package _0120_자동차만들기;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Bus bus = new Bus("고속버스");
            SportsCar sportsCar = new SportsCar("포르쉐");
            Sedan sedan = new Sedan("아반떼");


            Scanner sc = new Scanner(System.in);
            System.out.print("이동지역을 선택하세요 [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
            int area = sc.nextInt();
            System.out.print("이동할 승객 수를 입력하세요 : ");
            int passenger = sc.nextInt();

            if (passenger > 5) {
                System.out.println("버스밖에 못탑니다");
                bus.turboOnOff();
                bus.setAmount(area);
                bus.setGasStation(area);
                bus.time(area);
            }
            else if (passenger > 2) {
                System.out.print("이동 차량을 선택하세요 [1] 승용차 [2] 버스 : ");
                int v = sc.nextInt();
                if (v == 1) {
                    sedan.turboOnOff();
                    sedan.setAmount(area);
                    sedan.setGasStation(area);
                    sedan.time(area);
                    }
                else{
                    bus.turboOnOff();
                    bus.setAmount(area);
                    bus.setGasStation(area);
                    bus.time(area);
                }
            }
            else {
                System.out.print("이동 차량을 선택하세요 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
                int v = sc.nextInt();
                switch (v) {
                    case 1 : {
                        sportsCar.turboOnOff();
                        sportsCar.setAmount(area);
                        sportsCar.setGasStation(area);
                        sportsCar.time(area);
                        break;
                    }
                    case 2 : {
                        sedan.turboOnOff();
                        sedan.setAmount(area);
                        sedan.setGasStation(area);
                        sedan.time(area);
                        break;
                    }
                    case 3 : {
                        bus.turboOnOff();
                        bus.setAmount(area);
                        bus.setGasStation(area);
                        bus.time(area);
                        break;
                    }
                    default :
                }
            }






    }
}
