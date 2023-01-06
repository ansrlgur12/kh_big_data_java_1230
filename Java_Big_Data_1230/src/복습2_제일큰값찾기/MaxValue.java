package 복습2_제일큰값찾기;

import java.util.Scanner;

// 세자리의 정수를 입력 받아서 100자리 10자리 1자리로 나누어 담고 이중 가장 큰 수 찾기
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리의 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num/100;
        int b = (num%100)/10;
        int c = num%10;

        if(a>b){
            System.out.println(Math.max(a,c));
        }
        else{
            System.out.println(Math.max(b,c));
        }



    }
}
