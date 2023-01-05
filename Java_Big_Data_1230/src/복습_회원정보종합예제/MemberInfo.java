package 복습_회원정보종합예제;

import java.util.Scanner;

// 이름, 나이, 성별, 직업 받아서 출력하기
public class MemberInfo { // 필드와 메소드가 있음
    // 필드 추가하기 : 필드란? 클래스 내부에서 사용하는 변수를 의미 (객체 생성 시객체 갯수 만큼 생성 됨)
    String name;
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);
    // 키보드로 입력된 값을 name 필드에 저장
    public void setName() {
        System.out.print("이름을 입력 하세요 : ");
        name = sc.next();
    }
    // 주어진 조건에 맞는 나이를 입력 받아서 age 필드에 저장
    public void setAge() {
        while (true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) return; // ?//
            System.out.println("나이를 잘못 입력 하셨습니다.");
        }
    }
    public void setGender() {
        while(true){
            System.out.print("성별을 입력하세요 : ");
            gender = sc.next().charAt(0); // 문자열에서 첫번째 문자를 입력 받음
            switch(gender){
                case 'M' :
                case 'm' :
                case 'F' :
                case 'f' :
                    return;
                default :
                    System.out.println("성별을 잘못 입력 하셨습니다.");

            }
        }
    }

}
