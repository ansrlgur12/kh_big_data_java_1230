package _0130_X보다작은수;

// 문제 : 정수 n개로 이루어진 배열 A와 정수 x가 주어진다. 이때 A에서 x보다 작은 수를 모두 출력
// 10 5 => 배열의 길이 / 주어진 정수 x
// 1 10 4 9 2 3 8 5 7 6
// 결과 : 1 4 2 3


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessThanEx {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
            if (A.get(i) < x) System.out.print(A.get(i) + " ");
        }
       // for (Integer e : A) if (e < x) System.out.print(e + " ");
    }
}
