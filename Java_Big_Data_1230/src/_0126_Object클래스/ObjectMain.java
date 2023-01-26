package _0126_Object클래스;
// Object 클래스 : 모든 클래스의 조상이 되는 최상위 클래스 (항상 존재하지만 숨어있음)
// toString : 해당 객체(인스턴스)에 대한 정보를 문자열로 반환 (클래스정보@해시코드)
// 정보에 표시되는 해시코드는 객체의 메모리 주소를 이옹해 해시 코드 생성
// equals() : 해당 객체와 매개변수로 전달 받은 객체를 비교하여 결과반환 (참조가 같은지?)

public class ObjectMain{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student1.equals(student2));
        student1 = student2;
        System.out.println(student1.equals(student2));
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
class Student extends Object {
    int id;
    String name;
}