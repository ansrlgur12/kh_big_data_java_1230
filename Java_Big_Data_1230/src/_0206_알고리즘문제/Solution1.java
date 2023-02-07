package _0206_알고리즘문제;

import java.util.Scanner;

//  0 <= n <= 99
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int[] num = new int[2];
        int firstNum = sc.nextInt();
        int cnt = 0; // 사이클의 길이
        int newNum; // 새로운 수
        if (firstNum < 10) {
            num[0] = 0;
            num[1] = firstNum;
        } else {
            num[0] = firstNum / 10;
            num[1] = firstNum % 10;
        }
        while (true) {
            cnt++;
            newNum = (num[1] * 10) + ((num[0]+num[1]) % 10);
            if (newNum == firstNum) {
                System.out.println("사이클의 길이 : " + cnt);
                break;
            }
            num[0] = newNum / 10;
            num[1] = newNum % 10;
        }
    }
}
