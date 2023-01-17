package _0117_암호체크;

import java.util.Scanner;

public class Password {
    private String pw;
    Scanner sc = new Scanner(System.in);
    private char[] a = {'!', '%','_', '#', '&', '+', '-', '*', '/'};

    Password() {
    }

    void passwordInput() {

        while (true) {
            System.out.print("암호를 입력하세요 : ");
            pw = sc.next();
            if (pw.equalsIgnoreCase("exit") || pw.equals("종료")) break;
            else if (pw.length() < 10 || pw.length() > 30) System.out.println("비밀번호 길이는 10 ~ 30자 사이입니다.");
            else return;
        }
    }

    String viewPassword() {
        char[] chrPw = pw.toCharArray();
        for (int i = 0; i < chrPw.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(chrPw[i] != a[j]) {
                    System.out.print("Bad password");
                }
                else {

                }
            }
        } return pw;
    }
}

