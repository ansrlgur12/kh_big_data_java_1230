package _0203_쓰레드예제6번;
// 플래그를 이용한 종료 방법
public class RunThread extends Thread{
    private boolean stop; // stop 플래그 설정

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    @Override
    public void run() {
        int cnt = 0;
        while (!stop) {
            ++cnt;
            System.out.println("Thread 실행 중...." + cnt + "회차");
        }
        System.out.println("종료를 위한 자원 정리...");
        System.out.println("실행 종료");
    }
}
