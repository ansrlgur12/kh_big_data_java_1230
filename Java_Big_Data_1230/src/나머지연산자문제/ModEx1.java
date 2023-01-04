package 나머지연산자문제;

import java.util.Scanner;

// 100의 자리 정수를 입력 받아서 3개의 변수(100자리/10자리/1자리)에 대입하기
public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int num = sc.nextInt();
        int a, b, c;
        a = num / 100;
        b = (num % 100) / 10;
        c = num % 10;

        System.out.println("100의 자리는 " + a + ", 10의 자리는 " + b + ", 1의 자리는 " + c);
    }
}
