package _0125_저항;
// 전자제품에서는 저항이 들어간다. 처음 색 2개는 저항의 값, 마지막은 곱해야 하는 값
// 색 : black, brown, red, orange, yellow, green, blue, violet, grey, white
// 값 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
// 곱 : 1, 10, 1000, 10,000, 100,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000
// 입력 : yellow violet red
// 결과 : 4,700
// 입력 : orange red blue
// 결과 : 32,000,000
// 입력 : white white white
// 결과 : 99,000,000,000

import java.util.Scanner;

public class ResistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] color = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        long[] value = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int a = 0;
        int b = 0;
        long c = 0;
        System.out.print("입력 : ");
        String colorIndex1 = sc.next();
        String colorIndex2 = sc.next();
        String valueIndex = sc.next();
        switch (colorIndex1) {
            case "black": a = color[0]; break;
            case "brown": a = color[1]; break;
            case "red": a = color[2]; break;
            case "orange": a = color[3]; break;
            case "yellow": a = color[4]; break;
            case "green": a = color[5]; break;
            case "blue": a = color[6]; break;
            case "violet": a = color[7]; break;
            case "grey": a = color[8]; break;
            case "white": a = color[9]; break;
        }
        switch (colorIndex2) {
            case "black": b = color[0]; break;
            case "brown": b = color[1]; break;
            case "red": b = color[2]; break;
            case "orange": b = color[3]; break;
            case "yellow": b = color[4]; break;
            case "green": b = color[5]; break;
            case "blue": b = color[6]; break;
            case "violet": b = color[7]; break;
            case "grey": b = color[8]; break;
            case "white": b = color[9]; break;
        }
        switch (valueIndex) {
            case "black": c = value[0]; break;
            case "brown": c = value[1]; break;
            case "red": c = value[2]; break;
            case "orange": c = value[3]; break;
            case "yellow": c = value[4]; break;
            case "green": c = value[5]; break;
            case "blue": c = value[6]; break;
            case "violet": c = value[7]; break;
            case "grey": c = value[8]; break;
            case "white": c = value[9]; break;
        }
        System.out.println(((a * 10) + b) * c);
    }

}
