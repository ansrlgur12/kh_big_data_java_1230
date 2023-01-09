package 복3_문자열반전;
//abcdefg => gfedcba

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
     //   char ch;
     //   for (int i = str.length(); i > 0; i--) {
      //      ch = str.charAt(i - 1);
       //     System.out.print(ch);
       // }
        int index = str.length();
        while(true) {
            index--;
            System.out.print(str.charAt(index));
            if (index == 0) break;
        }
    }
}
