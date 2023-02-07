package _0206_알고리즘문제;

import java.util.Scanner;

public class Solution1_RE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0; // 입력받은 수의 10의자리와 1의 자리를 분리해서 더함
        int newNumber = 0; // 새롭게 만들어진 수
        int cnt = 0; // 사이클 회수 누적
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int num = input;
         while (true) {
             sumNumber = (num/10) + (num % 10); // 입력값을 10의 자리와 1자리로 분리해서 더함
             newNumber = (num % 10) * 10 + (sumNumber % 10); // 입력값의 1의 자리 + 계산된 값의 1자리 더함
             cnt++;
             if (newNumber == input) break; // 더하기 조건에 따라 1cycle 순회 후 입력받은 값과 비교
             num = newNumber;
         }
         System.out.println(cnt);
    }
}
