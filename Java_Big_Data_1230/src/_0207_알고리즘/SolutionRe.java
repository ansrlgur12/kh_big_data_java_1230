package _0207_알고리즘;

import java.util.Scanner;

public class SolutionRe {
    public static void main(String[] args) {
        int sum = 0; // 각 영어 문자를 더해서 총 합계를 만드는 변수
        boolean isPrime = true; // 소수인 상태를 기본값으로 설정
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        System.out.println("합 : " + sum);
        for (int i = 2; i < sum ; i++) {
            if (sum % i == 0) isPrime = false;
        }
        if (isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word");
    }
}
