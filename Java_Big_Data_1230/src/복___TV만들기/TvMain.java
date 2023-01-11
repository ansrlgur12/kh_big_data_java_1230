package 복___TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TV samsungTv = new TV();
        TV lgTv = new TV(true, 59, 15); // 매개변수가 있는 생성자 호출

        lgTv.getTV();

        samsungTv.setON(true);
        samsungTv.setChannel(1000);
        samsungTv.setVolume(101);
        samsungTv.getTV();
    }
}
