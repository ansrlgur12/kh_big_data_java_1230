package _0117_Re암호체크;

import java.util.Scanner;

public class PwdCheckClass {
    boolean validLength(String pwd) {
        if (pwd.length() >= 10 && pwd.length() <= 30) return true;
        return false;
    }

}
