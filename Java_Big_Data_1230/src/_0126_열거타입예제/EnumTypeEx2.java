package _0126_열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer dev = new Developer("곰돌이 사육사", DevType.EMBEDDED, Career.JUNIOR, Gender.MALE);
        dev.devInfo();

        Developer dev2 = new Developer("곰돌이 사육", DevType.FRONTEND, Career.JUNIOR, Gender.FEMALE);
        dev2.devInfo();
    }
}
