package _0131_HashSet응용;

import java.util.*;

// 문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어 오면 아래와 같은 조건에 따라 정렬하는 프로그램 작성
// 조건 1 : 길이가 짧은 것 부터
// 조건 2 : 길이가 같으면 사전 순으로
// 조건 3 : 중복 제거
// 입력 : 13 but i  wont hesitate no more no more it cannot wait im yours
// 출력 : i im it no but more wait wont yours cannot hesitate
public class HashSetApplyEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.print("입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String strArr[] = new String[len];
        for (int i = 0; i < strArr.length; i++) strArr[i] = sc.next();

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                }
                return -1;
            }
        });
        for (int i = 0; i < strArr.length; i++) {
            String a = strArr[i];
            set.add(a);
        }

    }
}
