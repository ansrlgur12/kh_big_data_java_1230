package _0131_HashSet응용;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetApplyEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어 개수 입력
        String[] word = new String[n];
        for (int i = 0; i < word.length; i++){ // n개의 개수만큼 단어 입력 받기
            word[i] = sc.next();
        }
        // HashSet 을 이용한 중복 제거
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word)); // 배열을 넣어서 hashset 만드는 방법
        word = hashSet.toArray(new String[0]); // 배열로 되돌리는법. 배열의 크기를 0으로 지정하면 자동으로 배열 크기가 지정 됨

        // 단어 정렬
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 결과가 양수이면 정렬 조건 임
                }else {
                    return o1.length() - o2.length(); // 결과가 양수이면 정렬
                }
            }
        });
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) return 1;
//                else {
//                    if (o1.length() == o2.length()) {
//                        return o1.compareTo(o2);
//                    }
//                }
//                return -1;
//            }
//        });
        for (String e : word) System.out.print(e + " ");

    }
}
