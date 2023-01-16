package 복___영화표예매;

import java.util.Scanner;

// 영화표 예매하기 클래스를 만들고 객체를 생성
// 극장의 좌석은 10개 (10개의 좌석 예약 상태를 기록하기 위한 배열 필요)
// 좌석당 가격은 12000원
// 메뉴는 예약하기와 종료로 구성
// 예약하기에서는 현재 좌석의 예약 상태를 보여주고 예약을 받음
// 종료는 판매된 좌석의 갯수를 확인해서 판매 금액을 구함 (3 * 12000 = 36000)
public class MovieMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        Scanner sc = new Scanner(System.in);
        while(true) { // 예약은 종료하기를 누르기 전까지는 계속 진행 해야함.
            int a;
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");

            a = sc.nextInt();

            if(a==1) {
                ticket.selectSeat(); // 좌석 예약하기에 대한 메소드 호출
            }
            if(a==2) {
                System.out.println(ticket.totalAmount()); // 종료하기 선택시 판매금액 게산
                break;
            }
         }
    }
}
