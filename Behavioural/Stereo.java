public class Stereo implements Device{
    @Override
    public void turnOn() {
        System.out.println("Stereo is now ON");

    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is now OFF");

    }
    public void adjustVolume(){
        System.out.println("Volume is adjusted");
    }
}
