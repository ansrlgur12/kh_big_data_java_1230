package _0605_인터페이스복습2;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        remoteControl = new Audio();
        remoteControl.turnOn();
        remoteControl.setVolume(-15);
        remoteControl.setMute(false);
    }
}
