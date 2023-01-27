package _0126_단어공부;

import java.util.Scanner;

// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대소문자를 입력하고 결과는 대소문자 구분하지 않는다.
// 만약 가장 많이 등장하는 알파벳이 여러개인 경우는 '?' 출력
// 결과예시 = AaAbcdd => A
// 결과예시 = ddcfgrG => ?
public class WordStudy {
    public static void main(String[] args) {


        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.print("입력하세요 : ");
        String str = sc.next();
        int[] aa = new int[str.length()];
        str = str.toUpperCase();
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) aa[i] += 1;
            }
            // 2중 for문으로 돌려보고 중복된 횟수 각각 aa 배열에 저장
            // aa 배열의 값 비교해서 최댓값구하기로 뽑기
        }


    }
}
