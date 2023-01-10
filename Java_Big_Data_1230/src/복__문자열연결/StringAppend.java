package 복__문자열연결;

import java.util.Scanner;

// 문자열 추가하기
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 입력 받은 정수 갯수 만큼의 문자를 뒤에서 부터 잘라 두번째 문자열 앞에 추가하기
// 2 = ulkorea
// 3 = oulkorea
// substring(index) = 문자열의 시작 위치 부터 끝까지 잘라냄
// substring 메소드를 이용해 문자열을 추출하기 전에 index 계산이 필요함
public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열을 입력하세요 : ");
        String a = sc.next();
        System.out.print("두번째 문자열을 입력하세요 : ");
        String b = sc.next();
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println(a.substring(a.length() - num) + b);
    }
}
// int position = fststr.length() - n
// string sub = fststr.substring(position);
// system.out.println(sub + secstr);
