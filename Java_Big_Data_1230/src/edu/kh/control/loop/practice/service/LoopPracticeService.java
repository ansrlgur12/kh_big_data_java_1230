package edu.kh.control.loop.practice.service;

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
}
