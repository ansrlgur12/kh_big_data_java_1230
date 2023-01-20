package _0120_자동차만들기;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        int speed = 200;
        int[] area = {0, 400, 200, 150, 300};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 지역 선택 번호
        double time = area[a] / speed;
        System.out.printf("%.2f시간", time);
    }
}
