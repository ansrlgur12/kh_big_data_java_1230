package 복습2_상근날드;

import java.util.Scanner;

// 상근날드 가게에서는 세트 메뉴를 판매합니다.
// 햄버거는 3가지 종류가 있다
// 음료는 2가지 종류가 있다
// 입력은 총 5가지의 값을 연속으로 입력 하는데, 햄버거 3가지 음료 2가지를 연속으로 입력
// 햄버거 세가지중 가장 싼 메뉴 선택, 음료 두가지중 싼 음료 선택하고, 세트 메뉴이기 때문에 50원 할인
// 총 세트 메뉴의 금액 구하기
public class SetMenu {
    public static void main(String[] args) {
        int[] price = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴의 금액을 입력하세요 : ");
        int menu1;
        int menu2;
        for(int i = 0; i < price.length; i++) {
            price[i] = sc.nextInt();
        }
        if (price[0]>price[1]){
            menu1 = (Math.min(price[1],price[2]));
        }
        else {
            menu1 = (Math.min(price[0],price[2]));
        }
        if (price[3]>price[4]){
            menu2 = (price[4]);
        }
        else {
            menu2 = (price[3]);
        }
        System.out.println(((menu1 + menu2) - 50) + "원" );
    }
}
