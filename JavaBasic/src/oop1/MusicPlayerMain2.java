package oop1;


public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        on(data);
        volumeUp(data);
        volumedown(data);
        volumeUp(data);
        off(data);
        showStatus(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("플레이어를 켭니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("플레이어를 끕니다.");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("현재 볼륨 : " + data.volume);
    }
    static void volumedown(MusicPlayerData data) {
        data.volume--;
        System.out.println("현재 볼륨 : " + data.volume);
    }
    static void showStatus(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("플레이어가 실행 중 입니다.");
        }else{
            System.out.println("플레이어가 종료된 상태 입니다.");
        }
    }
}
