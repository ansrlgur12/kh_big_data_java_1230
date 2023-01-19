package _0119_두번째숫자찾기;

// 숫자 10개 받기. 10칸짜리 배열에 넣기 (for 문)
// 2번쨰 등장하는 숫자를 찾는 메소드 작성
// 출력해주는 메소드 작성
import java.util.Scanner;

// 임의의 숫자 10개를 입력 받아 중복된 숫자 중 2번째 등장하는 숫자의 위치 찾기
// 1 2 3 4 5 1 2 3 4 5
// 5 ==> 10
// 임의의 수 입력 : 1 2 3 4 5 5 6 7 8 2
// 찾을 숫자 : 5
// 결과 : 6
// 만약에 2번째 등장하는 수가 없으면 -1 출력
public class SecondNum {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int num; // 입력받을 수
        int a = 0;
        int b = 0;
        boolean c = false;
        System.out.print("임의의 숫자 10개를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("찾을 숫자를 입력하세요 : ");
        num = sc.nextInt();

        while(a == 2) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    a++;
                }
                else {
                    b++;
                }
            }System.out.println("결과 : " + b);
        }


    }
}
