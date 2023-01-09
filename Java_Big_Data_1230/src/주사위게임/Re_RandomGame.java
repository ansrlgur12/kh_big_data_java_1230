package 주사위게임;
//주사위 2개 던져서 합 12이면 탈출하는 게임
public class Re_RandomGame {
    public static void main(String[] args) {

        int ran1, ran2;
        int cnt = 0;
        while(true) {
            ran1 = (int)((Math.random() * 6) + 1);
            ran2 = (int)((Math.random() * 6) + 1);
            if (ran1 + ran2 != 12) {
                System.out.println("주사위의 합이 " + (ran1 + ran2) + " 입니다.");
                cnt++;
            }
            else {
                System.out.printf("%d번만에 탈출에 성공하였습니다!!\n", cnt);
                break;
            }
        }
    }
}
