package _0201_트리맵기본;

import java.util.Map;
import java.util.TreeMap;

// TreeMap 도 TreeSet 과 마찬가지로 이진검색트리(값이 추가될 때 정렬이 됨)로 구현되어 있습니다.
// TreeMap 은 Key 값으로 정렬하므로 key 값에 해당하는 Comparable 과 Comparator 를 구현해야 함
public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(87, "나희도");
        score.put(88, "고유림");
        score.put(75, "백이진");
        score.put(65, "구자경");
        score.put(98, "우영우");

        Map.Entry<Integer, String> entry = null;
        entry = score.firstEntry();
        System.out.println("가장 낮은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lowerEntry(95);
        System.out.println("95점 아래 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.higherEntry(95);
        System.out.println("95점 위의 점수 : " + entry.getKey() + " : " + entry.getValue());


    }
}
