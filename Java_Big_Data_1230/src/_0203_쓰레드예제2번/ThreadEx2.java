package _0203_쓰레드예제2번;
// 스레드 생성 방법
// 첫번째 - 상속을 받는 방법 (extends Thread) : 구현이 간편하지만 다른 상속을 받지 못하는 단점이 있음
// 두번째 - Runnable 인터페이스로 구현 : 다른클래스의 상속을 받을 수 있음, 쓰레드 객체를 만드는 과정이 필요
// 세번째 - 익명의 객체로 구현 : 클래스 생성 없이 간편하게 구현할 수 있음
public class ThreadEx2 {
    public static void main(String[] args) {
        Thread clsTh = new CustomThread();
        clsTh.start(); // 내부적으로 run()메소드가 호출 됨

        Runnable run = new RunThread(); // 수행해야할 작업내용은 포함하고 있지만 실제 스레드가 아님
        Thread runTh1 = new Thread(run);
        Thread runTh2 = new Thread(run);
        runTh1.start();
        runTh2.start();

        // 익명의 객체 생성
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += 1;
                    System.out.println("" + Thread.currentThread() + sum);
                }
                System.out.println(Thread.currentThread() + " 합계 : " + sum);
            }
        };
        Thread runTh3 = new Thread(task);
        runTh3.start();

        // 익명의 객체를 람다식으로 생성
        Runnable task2 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
                System.out.println("" + Thread.currentThread() + sum);
            }
            System.out.println(Thread.currentThread() + " 합계 : " + sum);
        };
        Thread runTh4 = new Thread(task2);
        runTh4.start();

        System.out.println("나는 메인 입니다.");
        System.out.println("나는 메인 입니다.");
        System.out.println("나는 메인 입니다.");
        System.out.println("나는 메인 입니다.");
    }
}
