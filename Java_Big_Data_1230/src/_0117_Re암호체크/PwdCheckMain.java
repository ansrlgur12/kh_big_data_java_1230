package _0117_Re암호체크;

import java.util.Scanner;

public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdCheckClass pwdCheck = new PwdCheckClass();
        String pwd; // 암호를 입력받는 변수 생성
        while (true) {
            System.out.print("암호 입력 : ");
            pwd = sc.next();
            if (pwd.equals("종료") || pwd.equalsIgnoreCase("exit")) break;
            if (!pwdCheck.validLength(pwd)) {
                System.out.println("Bad length password");
                continue;
            }
            if (!pwdCheck.validNumber(pwd)) {
                System.out.println("Bad number password");
                continue;
            }
            if (!pwdCheck.validLowerAlphabet(pwd)) {
                System.out.println("Bad Lower Alphabet password");
                continue;
            }
            if (!pwdCheck.validUpperAlphabet(pwd)) {
                System.out.println("Bad Upper Alphabet password");
                continue;
            }
            if (!pwdCheck.validRex(pwd)) {
                System.out.println("Bad Rex password");
                continue;
            }
            System.out.println("Good password");
        }
    }
}