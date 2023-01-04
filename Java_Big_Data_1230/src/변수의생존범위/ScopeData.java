package 변수의생존범위;

import java.util.Scanner;

// 상수란? 변수와 마찬가지로 데이터를 저장할 수 있는 메모리공간을 의미
// 변수와 다른점은 프로그램이 실행되는 동안 값이 변경이 안됨
// 자바에서 상수는 final 키워드로 정의하고 단 한번만 값을 설정할 수 있다 (상수는 대문자로 나타내는 경우가 있다)
public class ScopeData {
    public static void main(String[] args) {
        final double taxRate = 0.10;
        Scanner sc = new Scanner (System.in);
        System.out.print("당신의 수입을 입력 하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신이 내야 할 세금은 " + income * taxRate);
    }
}
