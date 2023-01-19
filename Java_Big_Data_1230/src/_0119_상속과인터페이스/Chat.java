package _0119_상속과인터페이스;

import _0119_인터페이스네트워크.NetworkAdapter;

public class Chat {
    Chat(){}
    void sendMsg() {
        System.out.println("메시지를 보냅니다.");
    }
    void rcvMsg() {
        System.out.println("메시지를 받습니다.");
    }
}

class WiFi extends Chat implements NetworkAdapter2 {
    String company;
    String name;
    public WiFi(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결되었습니다.");
    }
    @Override
    void sendMsg() {
        System.out.println(name + "에게 메시지를 보냅니다.");
    }
    @Override
    void rcvMsg() {
        System.out.println(name + "으로부터 메시지를 받습니다.");
    }
}

class FiveG extends Chat implements NetworkAdapter2 {
    String company;
    String name;
    public FiveG(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결되었습니다.");
    }
    @Override
    void sendMsg() {
        System.out.println(name + "에게 메시지를 보냅니다.");
    }
    @Override
    void rcvMsg() {
        System.out.println(name + "으로부터 메시지를 받습니다.");
    }
}

