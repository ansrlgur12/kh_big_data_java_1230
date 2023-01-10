package 복__간판만들기;
// 각 숫자마다 차지하는 공간이 다르다.
// 0은 4칸, 1은 2칸, 나머지 수는 3칸
// 간판의 각 숫자 사이는 1칸의 여백이 필요
// 총 입력한 숫자가 몇칸을 차지하는지
// 120 : 13
// 5611 : 1 + 3 + 1 + 3 + 1 + 2 + 1 + 2 + 1 : 15
// 입력은 0이 들어 올때 까지 계속 반복
import java.util.Scanner;

public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("숫자를 입력하세요 : ");
            String sign = sc.next();
            char[] chSign = sign.toCharArray();
            int sum = 1;

            if (sign.equals("0")) break; //  if(sign.charAt(0) == '0')
            for (char e : chSign) {
                if (e == '0') {
                        sum += 5;
                } else if (e == '1') {
                        sum += 3;
                } else if (e > '1' && e <= '9') {
                        sum += 4;
                }
            }
            System.out.println(sum);
        }
    }
}


