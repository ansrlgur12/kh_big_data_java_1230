package _0119_인터페이스리모컨;

public class Televison implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Televison 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Televison 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else this.volume = volume;
        System.out.println("현재 Televison 볼륨 : " + this.volume);
    }

    public void getInfo() {
        System.out.println("Televison 입니다.");
        System.out.println("현재 Televison 볼륨은 " + volume + " 입니다.");
    }
    @Override
    public void setMute(boolean mute) {
        if (mute) System.out.println("Televison 무음 처리 합니다.");
        else System.out.println("Televison 무음 해제 합니다.");
    }
}
