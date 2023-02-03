package _0203_문제;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        System.out.print("8진법 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String two[] = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String two2[] = {"", "1", "10", "11", "100", "101", "110", "111"};
        String eight = sc.next();

        for (int i = 0; i < eight.length(); i++) {
            if (eight.length() == 1 && eight.charAt(0) - '0' == 0) {
                System.out.println("0");
                break;
            }
            if (i == 0) {
                System.out.print(two2[eight.charAt(i) - '0']);
            } else {
                System.out.print(two[eight.charAt(i) - '0']);
            }
        }

    }
}
