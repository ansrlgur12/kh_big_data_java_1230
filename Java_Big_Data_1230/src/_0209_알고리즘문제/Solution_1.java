package _0209_알고리즘문제;

import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {
        // 배열의 크기 /  테스트 케이스 횟수 입력
        System.out.print("배열크기와 테스트횟수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int testCnt = sc.nextInt();
        // 배열의 요소 입력
        int arr[] = new int[arrSize]; // 5, 4, 3, 2, 1
        System.out.print(arrSize + "개의 값을 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // 배열의 자리수, 자리수 입력
        int[] answer = new int[testCnt];
        int[] left = new int[testCnt];
        int[] right = new int[testCnt];
        System.out.println("합을 구하고 싶은 구간을 입력하세요 : ");
        for (int i = 0; i < answer.length; i++) {
            left[i] = sc.nextInt(); // 1, 2, 5
            right[i] = sc.nextInt(); // 3, 4, 5
            for (int j = 0; j <= right[i] - left[i]; j++) {
                answer[i] += arr[(left[i] - 1) + j];
            }
        }

        for (int e : answer) System.out.println(e);

        // 출력 : 자리수부터 자리수까지 더한 값 출력
    }
}
