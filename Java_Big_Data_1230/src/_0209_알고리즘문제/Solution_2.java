package _0209_알고리즘문제;

import java.util.Scanner;
public class Solution_2 {
    public static void main(String[] args) {
        // 배열의 크기 /  테스트 케이스 횟수 입력
        System.out.print("배열크기와 테스트횟수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int testCnt = sc.nextInt();
        // 배열의 요소 입력
        int arr[] = new int[arrSize]; // 5, 4, 3, 2, 1
        int arrSum[] = new int[arrSize];
        System.out.print(arrSize + "개의 값을 입력하세요 : ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) {
                arrSum[0] = arr[0];
            }
            else arrSum[i] = arrSum[i-1] + arr[i];
        }

        // 배열의 자리수, 자리수 입력
        int[] answer = new int[testCnt];
        int[] left = new int[testCnt];
        int[] right = new int[testCnt];
        System.out.println("합을 구하고 싶은 구간을 입력하세요 : ");
        for (int i = 0; i < answer.length; i++) {
            left[i] = sc.nextInt(); // 1, 2, 5
            right[i] = sc.nextInt(); // 3, 4, 5
        }
        for (int i = 0; i < answer.length; i++) {
            if (left[i] != 1) answer[i] = arrSum[right[i]-1] - arrSum[left[i]-2];
            else answer[i] = arrSum[right[i]-1] - 0;

        }
        for (int e : answer) System.out.println(e);
    }
}
