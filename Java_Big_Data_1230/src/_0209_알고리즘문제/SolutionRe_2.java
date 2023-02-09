package _0209_알고리즘문제;

import java.util.Scanner;

public class SolutionRe_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        long sumArr[] = new long[n]; // 합 배열
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) sumArr[0] = arr[0];
            else sumArr[i] = sumArr[i-1] + arr[i];
        }
        int left, right;
        while (x != 0) {
            left = sc.nextInt();
            right = sc.nextInt();
            if (left != 1)System.out.println(sumArr[right-1] - sumArr[left-2]);
            else System.out.println(sumArr[right-1] - 0);
            x--;
        }

    }
}
