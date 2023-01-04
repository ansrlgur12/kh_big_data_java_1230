package 연산자연습1;

import java.io.IOException;
import java.util.Scanner;

// 산술연산자 : +, -, *, /, %(나머지)
// 이항연산자
// 삼항연산자 : 항이 3개인 연산자 (참과 거짓이 있는 조건문과 같음)
// 대입연산자 : 값을 변수에 대입할 때 사용, 대입은 항상 뒤에서 앞으로 일어남
// 복합대입연산자 : 연산 후 대입
// 증강연산자 : 값을 1 증가하거나 감소 시키는 연산자(단항 연산자), ++, -- . 우위와 전위에 따라 상황이 달라짐
// 비교연산자 : 값의 크기를 비교하는 연산자
// 논리연산자 : 참과 거짓을 판단 하는 연산자 AND(&&) OR(||) NOT(!)
// 문자열 결합 연산자 : 문자열을 이어주는 연산자.
public class OperatorEx {
//    public static void main(String[] args) { //산술연산자
//        int num1 = 10, num2 = 0;
//        System.out.println(" + 연산자 : " + (num1 + num2));
//        System.out.println(" - 연산자 : " + (num1 - num2));
//        System.out.println(" * 연산자 : " + (num1 * num2));
//        System.out.println(" / 연산자 : " + ((double) num1 / num2));
//        System.out.println(" % 연산자 : " + (num1 % num2));

//        try {
//            System.out.println(num1 / num2);
//        } catch (ArithmeticException e) {
//            System.out.println("값을 0으로 나누면 안됩니다.");
//        }
//    public static void main(String[] args) { //복합대입연산자
//        int num1 = 10;
//        System.out.println(num1 += 2); // num1 = num1 + 2
//        System.out.println(num1 -= 2); // num1 = num1 - 2
//        System.out.println(num1 *= 2); // num1 = num1 * 2
//        System.out.println(num1 /= 2); // num1 = num1 / 2
//        System.out.println(num1 %= 2); // num1 = num1 % 2
//    }
//    public static void main(String[] args) { //증강연산자
//        int num1 = 10;
//        System.out.println(num1--);
//        System.out.println(num1);
//
//    }
//    public static void main(String[] args) { //비교연산자
//        int x = 10, y = 20;
//        System.out.println(x > y); // false
//        System.out.println(x < y); // true
//        System.out.println(x == y); // == 같다, = 대입
//        System.out.println(x >= y); // false
//        System.out.println(x <= y); // true
//    }
//public static void main(String[] args) { //논리연산자
//    int x = 10, y = 20;
//    boolean rst1, rst2, rst3;
//    rst1 = (x > y) && (x > 5); // 거짓
//    rst2 = (x > y) || (x > 5); // 참
//    rst3 = !((x > y) || (x > 5)); // 거짓
//
//    System.out.println(rst1);
//    System.out.println(rst2);
//    System.out.println(rst3);
//    }
//    public static void main(String[] args){ //삼항연산자
//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        boolean isAdult = (age > 19) ? true : false;
//
//        System.out.println(isAdult);
//
//    }
    public static void main(String[] args){ //문자열 결합 연산자
        System.out.println("Java" + 11.03 + 12);
    }
}
