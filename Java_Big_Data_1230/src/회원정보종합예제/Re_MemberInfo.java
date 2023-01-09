package 회원정보종합예제;

import java.util.Scanner;

//// 이름, 나이, 성별, 직업 받아서 출력하기
public class Re_MemberInfo {

    String name;
    int age;
    char gender;
    int job;
    Scanner sc = new Scanner(System.in);

   public void setName(){
       System.out.print("이름을 입력하세요 : ");
       name = sc.next();
   }

    public void setAge(){
       System.out.print("나이를 입력하세요 : ");
       age = sc.nextInt();
       while(true) {
           if (age > 0 && age < 200) {
               return;
           }
               System.out.println("나이를 잘못 입력하셨습니다.");
       }
   }

    public void setGender(){
       System.out.print("성별을 입력하세요(M/F) : ");
       gender = sc.next().charAt(0);
       switch(gender){
           case  'm' :
           case  'M' :
           case  'f' :
           case  'F' :
               return;
           default:
               System.out.println("성별을 잘못 입력하셨습니다.");
        }
    }

    public void setJob(){
        System.out.print("직업을 입력하세요 (1. 학생 2. 회사원 3. 주부 4. 무직 : ");
        job = sc.nextInt();
        if (job > 0 && job < 5) {
            return;
        }
        System.out.println("직업을 잘못 입력하셨습니다.");
   }

   public int getGenderType(){
       if (gender == 'm' || gender == 'M') {
           return 1;
       }
       else return 2;
   }

   public void viewInfo() {
       String[] genderStr = {"", "남성", "여성"};
       String[] jobStr = {"", "학생", "회사원", "주부", "무직"};
       System.out.println("========= 회원 정보 출력 =========");
       System.out.println("이름 : " + name);
       System.out.println("나이 : " + age);
       System.out.println("성별 : " + genderStr[getGenderType()]);
       System.out.println("직업 : " + jobStr[job]);
   }
}


