package _0201_코테_암호문;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 입력 : ");
        String normal = sc.nextLine(); // 평문은 공백이 있음
        System.out.print("암호키 입력 : ");
        String encrypt = sc.next();
        char[] enc = encrypt.toCharArray(); // 암호화키를 문자 배열로 변경
        char value; // 암호문을 만들기 위한 문자 변수
        List<Character> vig = new ArrayList<>();
        for (int i = 0; i < normal.length(); i++) {
            if (normal.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char) (normal.charAt(i) - (enc[i % encrypt.length()] - 'a') - 1);
                if (value < 'a') value += 26;
                vig.add(value);
            }
        }
        for (Character e : vig) System.out.print(e);
    }
}
