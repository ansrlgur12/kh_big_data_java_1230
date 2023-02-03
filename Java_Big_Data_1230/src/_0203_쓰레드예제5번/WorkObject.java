package _0203_쓰레드예제5번;
// 스레드에서 공통으로 사용하는 클래스 생성
// synchronized : 멀티스레드 환경에서 동시 접속 허용이 되지 않도록 lock 을 거는 작업을 의미함

public class WorkObject {
    public synchronized void methodA(){
        System.out.println("Thread 의 methodA() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadB를 실행 대기 상태로 전환
        try {
            wait(); // ThreadA를 일시정지 상태로 만듬
        } catch (InterruptedException e){}
    }

    public synchronized void methodB(){
        System.out.println("Thread 의 methodB() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadA를 실행 대기 상태로 전환
        try {
            wait(); // ThreadB를 일시정지 상태로 만듬
        } catch (InterruptedException e){}
    }
}
