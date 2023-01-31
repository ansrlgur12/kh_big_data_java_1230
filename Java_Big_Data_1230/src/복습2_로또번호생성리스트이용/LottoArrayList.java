package 복습2_로또번호생성리스트이용;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
// 리스트 타입을 HashSet을 이용해 중복 제거로 변경하기
public class LottoArrayList {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        while(true) {
            int tmp = (int)((Math.random() * 45) + 1);
            list.add(tmp);
            if(list.size() == 6) break;
        }
        System.out.println(list);
    }
}

