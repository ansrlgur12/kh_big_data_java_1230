package _0119_상속과인터페이스;

public interface NetworkAdapter2 {
    void connect();
    default void description() { // 인터페이스 내에 예외적으로 구현부가 있는 메소드
        System.out.println("자바 8에서 추가된 새로운 문법 입니다.");
    }
}
