package _0208_함수형프로그램예제1번;
// 함수형 프로그램이란 : 자바 8에서부터 도입, 수학 공식과 유사하고 데이터 불변성의 원칙, 조건문 반복문 사용금지 등의 특징을 가지고있다.
// 람다(Lambda) : 화살표 표현식으로 사용된다. 생략 가능한 모든것을 생략하는 것을 기본원칙으로 한다.
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재할 수 없으므로 함수형 인터페이스가 필요하다.
@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

@FunctionalInterface
interface MyFuncInterface {
    void method(int x); // 매개변수가 있는 타입
}

@FunctionalInterface
interface MyFuncInterface2 {
    int min(int x, int y); // 반환타입이 있는 형식
}


public class FunctionEx1 {
    public static void main(String[] args) {
//        Calculator mc = (a, b) -> a + b;
//        int rst = mc.sum(3, 4);
//        System.out.println(rst);
//        MyFuncInterface fi = x -> {
//          int result = x * 5;
//          System.out.println(result);
//        };
//        fi.method(2);
        MyFuncInterface2 fi = (x, y) -> x < y ? x : y; // 구현부
        System.out.println(fi.min(3, 4));
    }
}
