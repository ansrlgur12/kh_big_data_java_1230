package 목12__홀수짝수나누어담기;
// 7개의 정수를 입력 받음 (배열 생성 필요)
// 정수 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSeparator {
    int[] inputArr = new int[7];
    int[] oddArr = new int[7];
    int[] evenArr = new int[7];
    int i = 0;
    int j = 0;
    Scanner sc = new Scanner(System.in);
    // 7개의 정수를 입력 받음

    OddEvenSeparator(){}

    void inputArray() {
        System.out.print("7개의 정수를 입력하세요 : ");
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
    }
    // 홀수 / 짝수 나누어 담기
    void separatorArray() {

        for (int e : inputArr) {
            if (e % 2 == 0) {
                evenArr[i++] = e;
            }
            else { oddArr[j++] = e;
            }
        }

    }


    // 홀수 / 짝수 배열 출력
    void printArray() {
        System.out.print("홀수 : ");
        for (int i = 0; i < j; i++) {
            System.out.printf("%d ", oddArr[i]);
        }
        System.out.printf("\n짝수 : ");
        for (int j = 0; j < i; j++) {
            System.out.printf("%d ", evenArr[j]);
        }
    }
}
