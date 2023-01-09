package edu.kh.control.loop.practice.service;

import javax.imageio.stream.ImageInputStream;
import javax.swing.text.Style;
import java.util.Scanner;

public class LoopPracticeService {

    Scanner sc = new Scanner(System.in);

    public void practice1(){
        //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
        // 단, 입력한 수는 1보다 크거나 같아야 합니다.
        // 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
        while(true) {

            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();

            if (num < 1) {
                System.out.println("1 이상의 숫자를 입력해주세요.");
            }
            else {
                for(int i = 1; i <= num; i++) {
                    System.out.print(i + " ");
                }
                break;
            }
        }
    }
    public void practice2(){
        //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
        //단, 입력한 수는 1보다 크거나 같아야 합니다.

        while(true) {
            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();

            if (num < 1) {
                System.out.println("1 이상의 숫자를 입력해주세요.");
            }
            else {
                for (int i = num; i > 0; i--) {
                    System.out.print(i + " ");
                } break;
            }

        }
    }
    public void practice3() {
        //1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1 ; i <= num; i++) {
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.printf("\b\b= %d", sum);
    }
    public void practice4() {
        //사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
        //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

        while(true) {
            System.out.print("정수 두개를 입력해주세요 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < 1 || b < 1) {
                System.out.println("1 이상의 숫자를 입력해주세요.");
            }
            else if (a > b) {
                for (int i = b; b <= a; b++) {
                    System.out.print(i + " ");
                    i++;
                } break;
            }
            else {
                for (int i = a; a <= b; a++) {
                    System.out.print(i + " ");
                    i++;
                } break;
            }
        }
    }
    public void practice5() {
        //사용자로부터 입력 받은 숫자의 단을 출력하세요.
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("숫자 : " + a);
        System.out.printf("======= %d단 =======\n", a);
        for(int i = 1; i < 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
    public void practice6() {

        while(true) {
            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();
            if (num < 2 || num > 9) {
                System.out.println("2 ~ 9 사이 숫자만 입력해주세요.");
            }
            else {
                for (int i = num; i <= 9; i++) {
                    System.out.printf("======== %d단 ========\n", i);
                    for (int j = 1; j < 10; j++) {
                        System.out.println(i + " x " + j + " = " + (i * j));
                    }
                }break;
            }

        }
    }
//다음과 같은 실행 예제를 구현하세요.
    public void practice7() {
        System.out.print("정수 입력 : ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public  void practice8() {
        System.out.print("정수 입력 : ");
        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            for (int j = (a - i); j > 0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//  1부터 사용자에게 입력 받은 수까지 중에서
//  1) 2와 3의 배수를 모두 출력하고
//  2) 2와 3의 공배수의 개수를 출력하세요.
    public void practice9() {
        System.out.print("자연수 하나를 입력하세요 : ");
        int num = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= num; i++){
            if (i%2 == 0 || i%3 == 0){
                System.out.print(i + " ");
            }
            if (i%2 == 0 && i%3 == 0){
                cnt++;
            }
        }System.out.println("\n\ncount : " + cnt);
    }

    public void practice10() {
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++){
            for (int j = (num-i); j > 1; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < num; k++) {
                System.out.print("*");

            }System.out.println();

        }
    }
    //정수 입력 : 5
    //*****
    //*   *
    //*   *
    //*   *
    //*****

    public void practice13(){
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
            if (i > 1 && i < num) {
                for (int j = 1; j < num-1; j++) {
                    System.out.print(" ");
                    if (j == num-2) System.out.print("*");
                }
            }else {
                for (int j = 1; j < num; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
