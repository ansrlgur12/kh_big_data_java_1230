package _0201_클래스정렬예제1;

import java.util.TreeSet;

// Comparable : 클래스 정렬을 구현하는 인터페이스 (일반적으로 TreeSet 에서만 사용)
// compareTo() : 메소드를 오버라이딩해서 정렬조건을 구현해야함.
// 정렬 조건은 자신의 객체와 매개변수로 입력받은 객체를 비교
// 정렬 조건은 양의 정수값을 반환하면 정렬 조건이 됨
// 정렬 조건을 0으로 반환하면 Set 의 특성으로 인해 해당 객체가 표시되지 않음
public class ComparableEx1 {
    public static void main(String[] args) {
        TreeSet<CarSort> ts = new TreeSet<>();
        ts.add(new CarSort("싼타페" , 2016, "흰색"));
        ts.add(new CarSort("쏘렌토" , 2012, "은색"));
        ts.add(new CarSort("그랜저" , 2022, "검정"));
        ts.add(new CarSort("g80" , 2022, "은색"));
        ts.add(new CarSort("아반때" , 2017, "은색"));

        System.out.println("aaac".compareTo("aaab"));


        System.out.println("생성된 객체의 개수 : " + ts.size());
        for (CarSort e : ts) {
            System.out.println("차종 : " + e.modelName + " 연식 " + e.modelYear + " 색상 : " + e.color);
        }
    }
}

