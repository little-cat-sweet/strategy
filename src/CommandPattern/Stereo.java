package CommandPattern;

public class Stereo {

    int volume;

    String cd;

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void on(){
        System.out.println("stereo on");
    }
    public void off(){
        System.out.println("stereo off");
    }
}
