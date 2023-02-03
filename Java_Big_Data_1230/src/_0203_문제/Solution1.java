package _0203_문제;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        System.out.print("8진법 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String eight = sc.next();
        String answer = "";

        for (int i = 0; i < eight.length(); i++) {
            switch (eight.charAt(i)) {
                case '0' : answer += "000"; break;
                case '1' : answer += "001"; break;
                case '2' : answer += "010"; break;
                case '3' : answer += "011"; break;
                case '4' : answer += "100"; break;
                case '5' : answer += "101"; break;
                case '6' : answer += "110"; break;
                case '7' : answer += "111"; break;
            }
        }
        if (answer.charAt(0) == '0') {
            if (answer.charAt(1) == '0') System.out.println(answer.substring(2));
            else System.out.println(answer.substring(1));
        }
        else System.out.println(answer);
    }
}
