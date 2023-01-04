package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
    Scanner sc = new Scanner(System.in);
    public void practice1(){


        System.out.print("인원 수 : ");
        int num1 = sc.nextInt();
        //char sNum = sc.nextLine().charAt(0);
        System.out.print("사탕 개수 : ");
        int num2 = sc.nextInt();
        System.out.println("\n1인당 사탕 개수 : " + num2 / num1);
        System.out.println("남는 사탕 개수 : " + num2 % num1);

    }
    public void practice2(){

        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("학년(정수만) : ");
        int num1 = sc.nextInt();
        System.out.print("반(정수만) : ");
        int num2 = sc.nextInt();
        System.out.print("번호(정수만) : ");
        int num3 = sc.nextInt();
        System.out.print("남학생 / 여학생 : ");
        String gender = sc.next();
        System.out.print("성적(소수점 아래 둘째 자리까지) : ");
        double num4 = sc.nextDouble();
        //System.out.printf("\n" + num1 + "학년 " + num2 + "반 " + num3 + "번 " + name + " " + gender + "의 성적은 %.2f이다.", num4);
        System.out.printf("\n%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", num1, num2,num3, name, gender, num4);

    }
    public void practice3(){

        System.out.print("국어 : ");
        int num1 = sc.nextInt();
        System.out.print("영어 : ");
        int num2 = sc.nextInt();
        System.out.print("수학 : ");
        int num3 = sc.nextInt();

        System.out.println("\n합계 : " + (num1 + num2 + num3));
        System.out.println("평균 : " + ((double)num1 + num2 + num3)/3);
    }

}
