package _0209_알고리즘문제;

import java.util.Scanner;

public class SolutionRe_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열 개수
        int x = sc.nextInt(); // 테스트 케이스
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0, right = 0;
        long sum = 0;
        while (x != 0) {
            left = sc.nextInt();
            right = sc.nextInt();
            for (int i = left-1; i < right; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
            x--;
        }
    }
}
