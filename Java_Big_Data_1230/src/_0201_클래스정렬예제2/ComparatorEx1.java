package _0201_클래스정렬예제2;

import java.util.TreeSet;

// Comparator 역시 정렬을 구현하는데 사용하는 인터페이스 이다.
public class ComparatorEx1 {
    public static void main(String[] args) {
        TreeSet<Fruit> ts = new TreeSet<>(new DescendComp());
        ts.add(new Fruit("수박", 12000));
        ts.add(new Fruit("포도", 3000));
        ts.add(new Fruit("딸기", 16000));
        ts.add(new Fruit("키위", 16000));

        for (Fruit f : ts) {
            System.out.println("이름 : " + f.name + " 가격 : " + f.price);
        }
    }
}
