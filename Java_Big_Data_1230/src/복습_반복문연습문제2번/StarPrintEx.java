package 복습_반복문연습문제2번;
// 입력 : 5
// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.Scanner;

public class StarPrintEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();
        for(int i=1 ; i<= a; i++) {
            for(int j=1 ; j<=i; j++){
                System.out.print("* ");

            } System.out.println();
        }

    }
}
