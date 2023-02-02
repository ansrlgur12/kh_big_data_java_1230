package _0201_클래스정렬연습문제Re;

import java.util.Comparator;

public class ScoreSort implements Comparator<StudentInfo> {
    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if (o1.score == o2.score) {
            return o1.num.compareTo(o2.num); // 성적이 같은 경우 학번순 정렬
        }
        return o2.score - o1.score; // 성적이 높은 사람 순으로 내림차순
    }
}
