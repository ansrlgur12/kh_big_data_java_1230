package _0125_다중인터페이스;

public interface AirCon {

    int MAX_TEMP = 30; // public final static 이 자동으로 추가 돔
    int MIN_TEMP = 0;
    void airConON(); // 자동으로 추상메소드가 됨 (abstract 자동 추가 됨)v
    void airConOFF(); //
    void setAirConTemp(int tmp);
}