package _0207_알고리즘;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력하세요 : ");
        String str = sc.next();
        str = str.toUpperCase();
        int val = 0;
        for (int i = 0; i < str.length(); i++) {
            val += (str.charAt(i) - 'A') + 1;
        }
        System.out.println("합 : " + val);
        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                System.out.println("It is not a prime word.");
                System.exit(0);
            }
        } System.out.println("It is a prime word.");
    }
}
