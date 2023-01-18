package _0117_평균은하겠지;

import java.util.Scanner;

public class Avg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        double[] result = new double[testCount];
        for (int i = 0; i < result.length; i++) {
            result[i] = Rate();
        }
        for (double e : result) {
            System.out.printf("%.3f%%\n", e);
        }
    }

    static double Rate(){
        int total = 0 , cnt = 0;
        Scanner sc = new Scanner(System.in);
        int studentCount = sc.nextInt();
        int[] score = new int[studentCount];
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i];
        }
        double average = (double)total / studentCount;
        for (int e : score) {
            if (e > average) cnt++;
        }
        return (double)cnt/studentCount * 100;

    }
}