package oop1;

import org.w3c.dom.ls.LSOutput;

public class MusicPlayerData {
    int volume = 0;
    boolean isOn = false;
    void VolumeUp() {
        volume++;
        System.out.println("현재 볼륨 : " + volume);
    }

    void On() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void VolumeDown() {
        volume--;
        System.out.println("현재 볼륨 : " + volume);
    }
}

