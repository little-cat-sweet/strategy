package CommandPattern;

public class StereoOffCommand implements Command{

    Stereo stereo;
    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd("反向想的钟");
        stereo.setVolume(11);
    }
}
