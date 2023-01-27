package _0127_손익분기점;

import java.util.Scanner;

public class ReBreakEventEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt();
        int varCost = sc.nextInt();
        int sellPrice = sc.nextInt();

        if (varCost >= sellPrice) {
            System.out.print("-1");
            return;
        }
        System.out.println((fixCost/(sellPrice-varCost))+1);
    }
}