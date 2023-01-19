package _0119_인터페이스코코아톡;
// 메신저 기능에 대한 클래스
public class CocoaTalk {
    private String to; // 상대방 이름을 저장
    private String msg; // 전달할 메시지 내용
    public CocoaTalk(String name) { // 생성자 호출시 상대방의 이름 집어넣기
        to = name;
    }

    public void writeMsg(String msg) {
        this.msg = to + " :" + msg;
    }
    public void send(NetAdapter na) {
        na.send(msg);
    }
}
