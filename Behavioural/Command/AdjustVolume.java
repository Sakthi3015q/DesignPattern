public class AdjustVolume implements Command{
    Stereo stereo;
    public AdjustVolume(Stereo stereo){
        this.stereo=stereo;
    }
    @Override
    public void execute() {
        stereo.adjustVolume();

    }
}
