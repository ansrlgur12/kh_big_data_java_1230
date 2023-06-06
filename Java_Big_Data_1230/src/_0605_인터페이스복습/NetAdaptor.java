package _0605_인터페이스복습;

public interface NetAdaptor {
    void connect(); // 자동으로 public abstract 가 추가됨
    void send(String msg);
}

class WiFi implements NetAdaptor{
    @Override
    public void connect(){

    }
    @Override
    public  void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}
class FiveG implements NetAdaptor{
    @Override
    public void connect(){

    }
    @Override
    public  void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}


