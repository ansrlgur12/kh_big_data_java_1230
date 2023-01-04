package 조건문예제1;
// 성적을 입력받음
// 입력 받은 값이 0 ~ 100 사이가 아니면 "잘못 입력 하였습니다" 출력
// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 나머지는 F
import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("점수를 입력하세요 : ");
//        int score = sc.nextInt();
//        if(score <= 100 && score >= 90){
//            System.out.println("당신의 성적은 A 입니다.");
//        }
//        else if (score >= 80 && score <90){
//            System.out.println("당신의 성적은 B 입니다.");
//        }
//        else if (score >= 70 && score <80){
//            System.out.println("당신의 성적은 C 입니다.");
//        }
//        else if (score >= 60 && score <70){
//            System.out.println("당신의 성적은 D 입니다.");
//        }
//        else if (score >= 0 && score <60){
//            System.out.println("당신의 성적은 F 입니다.");
//        }
//        else{
//            System.out.println("잘못 입력하였습니다.");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("잘못 입력하였습니다.");
            return;

        }
        else if (score >= 90){
            System.out.println("A");
        }
        else if (score >= 80){
            System.out.println("B");
        }
        else if (score >= 70){
            System.out.println("C");
        }
        else if (score >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

//    Scanner sc = new Scanner(System.in);
//    System.out.print("성적을 입력하세요. : ");
//    int score = sc.nextInt();
//    if(score>=0 && score<=100){
//        if(score >=90) System.out.println("A");
//        else if(score >=80) System.out.println("B");
//        else if(score >=70) System.out.println("C");
//        else if(score >=60) System.out.println("D");
//        else System.out.println("F");
//    }
//    else {
//        System.out.println("잘못 입력 하였습니다.");
//    }
    }
}
