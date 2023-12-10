package CommandPattern;

public class StereoOnCommand implements Command{

    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
        stereo.setCd("反向想的钟");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
