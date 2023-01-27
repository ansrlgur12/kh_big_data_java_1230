package _0127_과일이름정렬;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 임이의 10개의 과일 이름 입력 후 길이 순으로 정렬하기. 길이가 같으면 사전순으로 정렬하기
// compareTo() 함수는 두개의 값을 비교하여 int 값으로 반환해주는 함수이다.

public class FruitTest {
    public static void main(String[] args) {
        String[] str = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("10개의 과일을 입력하세요 : ");
        for (int i = 0; i < 10; i++) str[i] = sc.next();

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 첫번째가 두번쨰 보다 길이가 길면 정렬 조건
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 두번째가 사전순서상 앞에 있으면 양수
                    }
                    return -1;
                }
            }
        });
        for (String e : str) System.out.print(e + " ");

        String test = "abcd";
        System.out.println(test.compareTo("ab")); // 양수
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("abcde")); // 음수
    }
}
