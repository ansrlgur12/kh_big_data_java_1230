package 복__간판만들기;

import java.util.Scanner;

public class T_SignBoardMake {
    public static void main(String[] args) {
        int[] numberSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        Scanner sc = new Scanner(System.in);
        String signNumber;
        int sum=0;
        while(true) {
            System.out.print("숫자를 입력하세요 : ");
            signNumber = sc.next();
            if (signNumber.equals("0")) break;
            for (int i = 0; i < signNumber.length(); i++) {
                sum += numberSize[signNumber.charAt(i)-'0'] + 1; // signNumber.charAt = 아스키코드
            }
            System.out.println(sum + 1);
            sum = 0;
        }
    }
}
