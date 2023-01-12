package 복___소수판별하기;
// 문제를 푸는 방법 : 메소드를 호출 시 정수값을 입력해서 해당 정수가 소수이면 그 값을 반환
import java.util.Scanner;

public class PrimeEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0; // 입력받은 정수 미만의 소수의 합을 누적
        // 반복문 수행 : 입력받은 정수 미만의 값으로 메소드를 호출 (12 = 2 ~ 11)
        for (int i = 2; i < num; i++) {
            sum += primeSum(i);
        }
        System.out.println("소수의 합 : " + sum);
    }

    static int primeSum(int n) {
        boolean isPrime = true; // 기본값을 소수로 정함
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }
        if (isPrime) return n;
        else return 0;
    }
}
