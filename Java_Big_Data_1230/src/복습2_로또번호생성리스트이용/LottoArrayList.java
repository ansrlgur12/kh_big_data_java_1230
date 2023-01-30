package 복습2_로또번호생성리스트이용;

import java.util.ArrayList;
import java.util.List;

public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int tmp; // 로또 번호를 임시로 저장하는 변수
        while(true) {
            if (list.size() == 6) break;
            tmp = (int)((Math.random() * 45) + 1);
            if (!list.contains(tmp)) list.add(tmp);

        }
        for (Integer e : list) System.out.print(e + " ");

    }
}
