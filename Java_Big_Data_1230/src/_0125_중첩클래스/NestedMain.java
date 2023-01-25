package _0125_중첩클래스;
// 중첩클래스란? 하나의 클래스 내부에 선언된 또 다른 클래스를 의미
// 일반적으로는 여러 클래스와 관계를 맺는 경우 독립적으로 클래스를 선언 함.
// 특별한 경우 특정 클래스와 관계를 맺는 클래스를 내부에 선언 하기도 함.
// - 내부클래스에서 외부클래스 멤버의 손쉬운 접근 가능
// - 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화 증가
// - 코드의 복잡성을 줄일 수 있음
public class NestedMain {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass(); // 정상적으로 내부 클래스의 메소드를 사용하는 방법
        outClass.inClass.inTest(); // 접근제한자 특성을 사용하지 않음
    }
}