package 복___영화표예매;

import java.util.Scanner;

// 현재 좌석 상태를 보여주는 메소드가 필요
// 좌석을 예매하는 메소드가 필요
// 판매된 좌석의 갯수를 구해 총 판매 금액을 구하는 메소드가 필요
public class MovieTicket {
    // 극장의 좌석 상태를 표시하는 배열 만들기 (총 10개)
    int[] seatArr = new int[10];

    // 현재 좌석 상태를 보여주는 메소드 작성
    // 0이면 [ ], 1이면 [V]
    void printSeat() {
        for (int i = 0; i < seatArr.length; i++) {
            if (seatArr[i] == 0) System.out.print(" [ ] ");
            else System.out.print(" [V] ");
        }
        System.out.println();
    }

    // 좌석을 예약하는 메소드
    void selectSeat() {
        printSeat();

        System.out.print("예약할 좌석 번호를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (seatArr[n - 1] == 1) { // 해당 배열의 값이 1이라는 건 이미 예약된 자리다
            System.out.println("이미 예약된 좌석입니다.");

        } else {
            seatArr[n - 1] = 1; //비어 있는 자리를 사용 함
            printSeat();
        }

        // printSeat() 호출해 현재 좌석 상태를 보여줌
        // 좌석 번호를 입력 받아서 좌석을 예약하는데 이미 예약된 좌석은 에러 문구 출력
        // 좌석 예약이 성공하면 다시 printSeat()를 호출해 좌석 상태를 보여줌
    }

    //
    int totalAmount() {
        int amt = 0;

        for (int e : seatArr) {
            if (e == 1) amt++; // if (seatArr[e] == 1) amt++;

        }return amt * 12000;

    }
}
//        System.out.println("총 예약된 좌석 : " + seatAmt + "석");
//        System.out.println("총 수입 : " + (seatAmt * 6) + "원");


        // 좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 갯수를 누적
        // 좌석 갯수와 좌석당 가격을 곱해서 결과를 반환



