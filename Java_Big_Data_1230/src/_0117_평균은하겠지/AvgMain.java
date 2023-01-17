package _0117_평균은하겠지;

import java.util.Scanner;

public class AvgMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double[] result = new double[c];
        for (int i = 0; i < result.length; i++) {
            result[i] = Avg();
        }
        for(double e : result) {
            System.out.printf("%.3f%%\n", e);
        }

    }

    static double Avg() {
        int total = 0, overCnt = 0;
        Scanner sc = new Scanner(System.in);
        int studentCnt = sc.nextInt();
        int[] score = new int[studentCnt];
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i];
        }
        double average = (double)total / studentCnt;
        for (int e : score) {
            if (e > average) overCnt++;
        }
        return (double)overCnt/studentCnt * 100;
    }
}
