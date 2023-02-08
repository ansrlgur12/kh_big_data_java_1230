package _0208_알고리즘문제;
// 입력 : 카드의 수 , 주어진 수
// 입력 : 주어진수 범위 내의 숫자 * 카드의 수
// 출력 : 주어진 수에 제일 가까운 숫자 3개의 합


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력하세요 : ");
        int N = sc.nextInt();
        int M = sc.nextInt();
        int card[] = new int[N];
        System.out.print("입력하세요 : ");
        for (int i = 0; i < card.length; i++) {
            card[i] = sc.nextInt();
        }
        int sum;
        int max = 0;
        for (int i = 0; i < card.length; i++) {
            for (int j = i + 1; j < card.length; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    sum = card[i] + card[j] + card[k];
                    if (sum == M) {
                        max = sum;
                    }
                    else {
                        if (sum > M) continue;
                        else {
                            if (sum > max) max = sum; // 그리고. && 사용하면 줄일 수 있음
                        }
                    }
                }
            }
        } System.out.println(max);
    }
}
