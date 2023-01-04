package 입출력예제2;

import java.io.IOException;
import java.util.Scanner; // 두번째로 많이 사용되는 자바 API
// 콘솔 입력
// System.in.read() : 키보드의 입력을 ASCII 코드값으로 읽어 들임
// Scanner 입력 : 키보드의 입력 원하는 데이터 타입으로 반환 받음
//static : 정적 main 한번 생성되면 끝.
//stack : 지역변수. 프로그램내에서 변수를 만들면 스택으로 들어감. 블럭을 지나면 소멸되는것들. <-garbage collector - jvm 소속
public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte(); // 키보드 입력을 byte 형으로 반환
        short b = sc.nextShort(); //
        int c = sc.nextInt();
        char ch = sc.next().charAt(0); // 문자열에서 첫번째(0) 문자를 추출
        String s1 = sc.next(); // next 는 문자열을 공백 단위로 입력 받음. (띄어쓰기 x)
        String s2 = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받음.
    }

//    public static void main(String[] args) {
//        while (true) { // 반복문
//            try {
//                int ketCode = System.in.read();
//                System.out.println("KeyCode : " + ketCode);
//                if(ketCode == 'q') break;
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//
//        }
//    }
}