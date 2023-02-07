package _0206_알고리즘문제;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int givenNum = sc.nextInt();
        String answerStr = "";
        while (true) {
            if (givenNum == 0) break;
            int answer = givenNum % 2;
            givenNum = givenNum / 2;
            answerStr += answer;
           // System.out.print(answer + " ");
        }
        int index = answerStr.length();
        while(true) {
            index--;
            System.out.print(answerStr.charAt(index));
            if (index == 0) break;
        }
    }
}
