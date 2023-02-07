package _0207_예외처리예제3번;
// NullPointException : 참조하고 있는 주소를 접근했을때 값이 없는 경우
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        try {
            String testStr = test.name;
            System.out.println(test);
        } catch (NullPointerException e) {
            System.out.println("참조하고 있는 주소의 객체가 없습니다.");
        }
    }
}

class Test{
    String name = "곰돌이사육사";

}
