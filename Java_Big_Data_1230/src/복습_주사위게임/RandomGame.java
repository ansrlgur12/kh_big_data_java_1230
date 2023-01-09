package 복습_주사위게임;
//주사위 2개 던져서 합 12이면 탈출하는 게임

public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;
        while(true) {
            cnt++; //몇번만에 탈출했는지를 나타낼 변수
            rand1 = (int) ((Math.random()*6) + 1); // Math.random . 랜덤함수는 실수형(0.1)으로 값이 생성되므로 형변환이 필요
            rand2 = (int) ((Math.random()*6) + 1); // 1을 더하는 이유는 math.random 값이 1인경우 0.n 으로 나오기때문에 정수형으로 형변환 했을때
            if ((rand1 + rand2) == 12){
                System.out.printf("무인도를 %d번 만에 탈출 합니다.", cnt);
                break;
            }else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }

        }
    }

}
