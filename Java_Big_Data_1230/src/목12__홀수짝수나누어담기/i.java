package 목12__홀수짝수나누어담기;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class i {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    void inputArray() {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.print("정수 입력 : ");
        while (true) {
            value = sc.nextInt();
            if (value == 999) break;
            inList.add(value); // ArrayList 값을 추가 함
        }
    }

    void separatorArray() {
        for (int e : inList) {
            if (e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }

    void printArray() {
        System.out.print("홀수 : ");
        for (int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for (int e : evenList) System.out.print(e + " ");
    }
}