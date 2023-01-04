package 입출력실습예제1;

import java.util.Scanner;
//이름, 주소, 성별, 나이, 전화번호를 입력 받아 출력 해보기.
public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine(); // 버퍼 지우기
        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();
        System.out.print("성별을 입력하세요(남/여) : ");
        char gender = sc.next().charAt(0);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("전화번호를 입력하세요 : ");
        String phoneNumber = sc.next();

        System.out.printf("이름 : %s\n주소 : %s\n성별 : %c\n나이 : %d\n전화번호 : %s", name, address, gender, age, phoneNumber);
//        System.out.println("=========== 회원 정보 출력 ===========");
//        System.out.println("이름 : " + name);
//        System.out.println("주소 : " + address);
//        System.out.println("성별 : " + gender);
//        System.out.println("나이 : " + age);
//        System.out.println("전화번호 : " + phoneNumber);
//


    }
}
