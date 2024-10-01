package oop1;

public class MusicPlayer {

        int volume = 0;
        boolean isOn = false;

    void On() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void Off() {
        isOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void VolumeUp() {
        volume++;
        System.out.println("현재 볼륨 : " + volume);
    }
    void VolumeDown() {
        volume--;
        System.out.println("현재 볼륨 : " + volume);
        }

    void ShowStatus() {
        if (isOn) {
            System.out.println("현재 구동중 , 현재 볼륨 : " + volume);
        } else {
            System.out.println("음악플레이어 종료 됨");
        }
    }

}
