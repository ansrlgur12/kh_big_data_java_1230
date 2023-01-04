package 입출력예제;

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "경기도 수원시";
        char gender = '남';
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        //double aver = 0.0;

        // 자바 스타일(메소드를 오버로딩 하는 방식)
        System.out.println("========= Java Style Output ==========");
        System.out.println("Name : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat)); // 소괄호가 없으면 문자열로 인식
        System.out.println("평균 : " + ((double)(kor + eng + mat)/3));

        // C언어 스타일(서식지정자를 사용)
        // 서식지정자 : %d(정수), %ld, %u(부호없는 정수), %f(float), %.2f(소숫점이하 n자리), %s(string), %c(문자 char), %%(퍼센트), %b
        // 이스케이프 시퀀스 : \n(줄바꿈), \r(커서 맨 앞), \t(tab), \b(backspace), \\
        System.out.printf("========= C Style Output ==========\n");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + mat)/3);

        System.out.print("Apple\rBanana\tKiwi\n");

        System.out.println("\"Enter\" 키를 입력 하시면 종료 됩니다.");
        System.out.println("Hello\\Java");
        System.out.printf("오늘의 습도는 %d%%\n", 25);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0 ; i <= n * n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println();
        }

    }
}
