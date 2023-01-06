package 복습2_평균점수구하기;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// 상현이가 가르치는 학생은 총 5명(안유진, 유나, 채원, 카즈하, 장원영)
// 기말고사를 치고 난 후 성적이 40점 이하인 경우 보충학습을 듣는 조건을 40점으로 성적을 조정 해줌
// 모든 학생이 보충학습을 들음
// 총 수강생의 평균을 구하는 프로그램 작성
// 점수는 모두 0점 이상이고 100점 이하인 5의 배수이다.
public class ArrayExAver {
    public static void main(String[] args) {
        // 스캐너 객체를 생성
        // 5명의 성적을 저장하기 위한 배열 생성
        int[] arr = new int[5];
        int sum = 0;
        System.out.print("다섯명의 성적을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 40) arr[i] = 40;
            sum += arr[i];
        }

            System.out.print(sum/5);
            // 배열을 순회하면서 5명의 성적을 입력 받으면서 성적이 40점 미만이면 올려 줌

            // 평균을 구하기 위해서 성적을 모두 합산 함.
            // 합산된 성적을 인원수로 나누어 평균을 구함.


    }
}
