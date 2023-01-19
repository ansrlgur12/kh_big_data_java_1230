package _0119_인터페이스네트워크;
// 인터페이스란? 완전추상화 개념으로 인터페이스에 포함된 메소드는 일반적으로 전부 추상메소드이다.
// 메소드를 선언하면 추가 여부에 상관 없이 public abstract 키워드로 동작
// interface 상속의 키워드는 implements 이다
public interface NetworkAdapter {
    void connect(); // public abstract 가 숨어져있다.
}

class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 WiFi에 연결 되었습니다.");
    }
}

class FiveG implements NetworkAdapter {
    String company;
    public FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 5G에 연결 되었습니다.");
    }
}
class LTE implements NetworkAdapter {
    String company;
    public LTE(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 LTE에 연결 되었습니다.");
    }
}