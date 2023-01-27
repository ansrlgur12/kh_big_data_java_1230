package _0127_손익분기점;

import java.util.Scanner;

public class BreakEvenPointEx {
    public static void main(String[] args) {
        int a, b, c;
        int i = 0;
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); // 고정지출
        b = sc.nextInt(); // 제작단가
        c = sc.nextInt(); // 판매가

        if (b >= c) System.out.print("-1");
//        else {
//            for (long i = 0; i < i+1; i++) {
//                if (a + (b * i) < c * i) {
//                    System.out.print(i);
//                    break;
//                }
//            }
//        }
        while (true) {
            if (a + (b * i) < c * i) break;
            i++;
        }
        System.out.println(i);
    }
}
