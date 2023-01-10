package 복__시간입력;

import java.util.Scanner;

// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력)
// 출력 : 오후 11시 05분 03초
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String time = sc.next();
        String[] result = time.split(":");
        int intHour = Integer.parseInt(result[0]);
        int intMin = Integer.parseInt(result[1]);
        int intSec = Integer.parseInt(result[2]); //<<<<<<<<<<<<<<<<<<<<<<<문자열을 int 로 형변환하는법 Integer.parseInt()

            if(intHour == 12) {
                System.out.printf("오후 %d시 %02d분 %02d초", intHour, intMin, intSec); //공백할때는 0 빼고
            }
            else if(intHour > 11) {
                intHour -= 12;
                System.out.printf("오후 %d시 %02d분 %02d초", intHour, intMin, intSec); //<<<<<<<<<<<< %02d 쓰는법 배우기 (정수열 n (2) 자리가 안되면 0을 채운다.) 별그리기때 써보기
            }
            else {
                System.out.printf("오전 %d시 %02d분 %02d초", intHour, intMin, intSec);
        }
    }
}
