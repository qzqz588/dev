package CH15;

interface Remocon{
    int MAXVOL=100;
    int MINVOL=0;
    //추상 메서드 추가
    void on();
    void off();
    void setVol(int vol);
}

class Tv implements Remocon{
    int vol;
    @Override
    public void on() {
        System.out.println("티비를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("티비를 끕니다.");
    }

    @Override
    public void setVol(int vol) {
        if(Remocon.MAXVOL<=vol)
            this.vol=Remocon.MAXVOL;
        else if (Remocon.MINVOL>=vol)
            this.vol=Remocon.MINVOL;
        else
        this.vol=vol;
        System.out.println("Tv 볼륨 : " + this.vol);
    }

}

interface Browser{
    void SearchURL(String url);

}
class SmartTv extends Tv implements Browser{
    @Override
    public void SearchURL(String url) {
        System.out.println(url + "로 이동합니다.");

    }
}
class Radio implements Remocon{
   int vol;
    @Override
    public void on() {
        System.out.println("라디오를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("라디오를 끕니다.");
    }

    @Override
    public void setVol(int vol) {
        if(Remocon.MAXVOL<=vol)
            this.vol=Remocon.MAXVOL;
        else if (Remocon.MINVOL>=vol)
            this.vol=Remocon.MINVOL;
        else
            this.vol=vol;
        System.out.println("RADIO 볼륨 : " + this.vol);
    }
}

public class C01InterfaceMain {
    public static void TurnOn(Remocon controller){
        controller.on();
    }
    public static void TurnOff(Remocon controller){
        controller.off();
    }
    public static void setVolume(Remocon controller,int vol){
        controller.setVol(vol);
    }
    public static void SearchWeb(Browser browser, String url){
        browser.SearchURL(url);
    }
    public static void main(String[] args) {
        Tv tv = new Tv();
        Radio radio = new Radio();
        SmartTv smarttv = new SmartTv();
        TurnOn(tv);
        TurnOn(radio);

        setVolume(tv, 50);
        setVolume(radio,150);
        SearchWeb(smarttv,"www.naver.com");
    }
}