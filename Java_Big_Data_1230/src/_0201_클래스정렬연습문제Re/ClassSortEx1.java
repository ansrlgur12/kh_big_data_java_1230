package _0201_클래스정렬연습문제Re;


// Comparator 사용해서 해결

import java.util.Scanner;
import java.util.TreeSet;

public class ClassSortEx1 {
    public static void main(String[] args) {
        TreeSet<StudentInfo> set = new TreeSet<>(new ScoreSort());
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 수 입력 : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(new StudentInfo(sc.next(), sc.nextInt(), sc.next()));
        }
        System.out.println("==== 학생 성적 출력 ====");
        System.out.println("----------------------");
        System.out.println("석차   성적   이름   학번");
        System.out.println("----------------------");
        int aa = 0; // 석차
        int preScore = 0;
        for (StudentInfo s : set) {
            if (preScore != s.score) aa++;
            System.out.printf("%2d%6d%6s%6s\n", aa, s.score, s.name, s.num);
            preScore = s.score; // 현재점수 저장

        }
    }
}


