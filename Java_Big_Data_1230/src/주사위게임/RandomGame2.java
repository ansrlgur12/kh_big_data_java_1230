package 주사위게임;

public class RandomGame2 {
    public static void main(String[] args) {
        int ran1;
        int ran2;
        int cnt=0;
        while(true) {
            ran1 = ((int)(Math.random() * 6) + 1);
            ran2 = ((int)(Math.random() * 6) + 1);

            cnt++;
            if ((ran1 + ran2) == 12){
                System.out.printf("%d번 만에 탈출에 성공하였습니다.", cnt);
                break;

            }
            else{
                System.out.printf("주사위의 합이 %d 입니다.\n", (ran1+ran2));

            }
        }
    }
}
