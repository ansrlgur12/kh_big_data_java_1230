package _0210_종합실습예제;

import java.util.Comparator;

public class DescendComp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.score == o2.score) {
            return o1.name.compareTo(o2.name);
        }
        return o2.score - o1.score;
    }
}
