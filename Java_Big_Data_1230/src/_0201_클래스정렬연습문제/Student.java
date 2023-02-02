package _0201_클래스정렬연습문제;

public class Student implements Comparable<Student>{
    String name;
    int score;
    int num;

    public Student(String name, int score, int num) {
        this.name = name;
        this.score = score;
        this.num = num;
    }

    @Override
    public int compareTo(Student o) {

        if (this.score == o.score) {
            return this.num - o.num; // 학번 오름차순
        }
        return o.score - this.score; // 성적 내림차순
    }
}

