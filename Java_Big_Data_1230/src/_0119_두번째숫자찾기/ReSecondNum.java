package _0119_두번째숫자찾기;

import java.util.Scanner;

public class ReSecondNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        int cnt = 0;
        System.out.print("임의의 수 10개 : ");
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("찾을 수 입력 : ");
        int secondNum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == secondNum) {
                cnt++;
                if (cnt == 2) {
                    System.out.print(i+1 + " ");
                    break;
                }
            }
        }
        if (cnt != 2)
        System.out.println("-1");
    }
}
